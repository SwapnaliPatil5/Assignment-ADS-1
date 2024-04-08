package com.example1;

//1. Write a Java Program to find GCD of two given numbers. 
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the first number  :  ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the second number  :  ");
		int number2 = sc.nextInt();

		int gcd = findGCD(number1, number2);
		System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGCD(b, a % b);
		}
	}
}
