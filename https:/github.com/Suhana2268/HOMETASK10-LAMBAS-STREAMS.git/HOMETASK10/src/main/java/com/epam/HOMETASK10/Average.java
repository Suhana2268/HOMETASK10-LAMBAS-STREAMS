package com.epam.HOMETASK10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Average 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        System.out.println("Enter the numbers");
        for(int i = 0; i < n; i++) {
        	int ele = sc.nextInt();
        	li.add(ele);
        }
       Integer sum = li.stream().reduce(0, (a, b) -> a + b);
        
        double average = 0.0;
        if(li.size() > 0) {
        	average = (sum/li.size());
        }
        System.out.println("The sum of the given numbers is : "+sum);
        System.out.println("The average of the numbers is : " + average);
    }
}

