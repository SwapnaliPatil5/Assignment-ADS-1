package com.example8;

import java.util.Scanner;

//8.  Write a Java Program to check whether the given numbers are Amicable Numbersor NOT.
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  number  :  ");
		int number1 = sc.nextInt(); // 220
		System.out.print("Enter the  number  :  ");
		int number2 = sc.nextInt(); // 284

		if (areAmicableNumbers(number1, number2)) {
			System.out.println(number1 + " and " + number2 + " are amicable numbers.");
		} else {
			System.out.println(number1 + " and " + number2 + " are not amicable numbers.");
		}
	}

	// Method to check if a pair of numbers are amicable
	public static boolean areAmicableNumbers(int num1, int num2) {
		return (sumOfProperDivisors(num1) == num2 && sumOfProperDivisors(num2) == num1);
	}

	// Method to calculate the sum of proper divisors of a number
	public static int sumOfProperDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
