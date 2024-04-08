package com.example5;

import java.util.Scanner;

//5. Write a Java Program to check whether the Given Number is Prime Number or NOT. 
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
