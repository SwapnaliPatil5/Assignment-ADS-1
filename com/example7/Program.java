package com.example7;

import java.util.Scanner;

//7. Write a Java Program to check whether the given number is Perfect Number or NOT. 
public class Program {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();        //28
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false; // Perfect numbers are positive integers
        }
        
        int sum = 0;
        // Find all divisors and add them
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum of divisors is equal to the number
        return sum == number;
    }
}

