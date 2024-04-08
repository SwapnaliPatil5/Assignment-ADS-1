package com.example2;

//2. Write a java program to LCM of TWO given number. 
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the first number  :  ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the second number  :  ");
		int number2 = sc.nextInt();

		int lcm = findLCM(number1, number2);
		System.out.println("The LCM of " + number1 + " and " + number2 + " is: " + lcm);
	}

	public static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGCD(b, a % b);
		}
	}
}
