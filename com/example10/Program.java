package com.example10;

import java.util.Scanner;

//10. Write a Java Program check whether the given number is Automorphic Numberor NOT.
public class Program {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();               //5,25,6,36,
		
		        if (isAutomorphicNumber(number)) {
		            System.out.println(number + " is an Automorphic number.");
		        } else {
		            System.out.println(number + " is not an Automorphic number.");
		        }
		    }

		    public static boolean isAutomorphicNumber(int n) {
		        int square = n * n;
		        while (n > 0) {
		            if (n % 10 != square % 10) {
		                return false;
		            }
		            n /= 10;
		            square /= 10;
		        }
		        return true;
		    }
		}
