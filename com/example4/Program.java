package com.example4;

import java.util.Scanner;

//4. Check whether the Given Number is a Palindrome or NOT. 
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(int number) {
		int originalNumber = number;
		int reverse = 0;

		while (number != 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number /= 10;
		}

		return originalNumber == reverse;
	}
}
