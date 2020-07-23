package com.epam.HOMETASK10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringA {
	public static List<String>stringsA(List<String> li) {
		List<String> ans = li.stream().filter(s -> (s.length() == 3) && s.charAt(0) == 'a').collect(Collectors.toList());
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings you want to enter");
		int n = sc.nextInt();
		List<String>li = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			String str = sc.nextLine();
			li.add(str);
		}
		List<String>result = stringsA(li);
		if(result.size() > 0) {
			System.out.println("The list of strings which are of length three and starts with alphabet a");
		for(String k:result) {
			System.out.println(k);
		}
		}
		else {
			System.out.println("There are no strings with length 3 and starting with a");
		}

	}

}

