package com.epam.HOMETASK10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PalindromeCheck {
	public static String isPalindrome(String str) {
		int len = str.length();
		String rev = "";
	      for ( int i = len - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	      return rev;
	}
	public static List<String> palindrome(List<String>li) {
		List<String> list =  li.stream().filter(string ->string.equals(isPalindrome(string))).collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings you want to enter");
		int n = sc.nextInt();
		System.out.println("Enter the strings");
		List<String>li = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			String str = sc.nextLine();
			li.add(str);
		}
		
		List<String>result = palindrome(li);
		if(result.size() > 1) {
			System.out.println("The list of strings which are palindromes are");
		for(String k:result) {
			System.out.println(k);
		}
	}
	else {
		System.out.println("There are no palindromes in the string");
	}
	}

}


