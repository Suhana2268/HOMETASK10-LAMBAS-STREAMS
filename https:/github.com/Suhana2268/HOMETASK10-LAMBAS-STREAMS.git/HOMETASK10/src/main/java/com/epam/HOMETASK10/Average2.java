package com.epam.HOMETASK10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Average2 
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
        int sum1 = li.stream().mapToInt(num->num.intValue()).sum();
        double average = 0.0;
        if(li.size() > 0) {
        	average = (sum1/li.size());
        }
        System.out.println("The sum of the given numbers is : "+sum1);
        System.out.println("The average of the numbers is : " + average);
    }
}

