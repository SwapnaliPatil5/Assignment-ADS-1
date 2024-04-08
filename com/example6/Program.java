package com.example6;

import java.util.Scanner;

//6. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 
public class Program {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();             //153
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        
        originalNumber = number;

        // Finding the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Checking if the number is Armstrong
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
