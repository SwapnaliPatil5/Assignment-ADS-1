package com.example3;

import java.util.Scanner;

//3. Write a Java Program to print all the Prime Factors of the Given Number. 
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();
		System.out.print("Prime factors of " + number + " are: ");
		printPrimeFactors(number);
	}

	public static void printPrimeFactors(int n) {

		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {

			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		if (n > 2) {
			System.out.print(n);
		}
	}
}
