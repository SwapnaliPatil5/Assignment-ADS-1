package com.example9;

import java.util.Scanner;

public class RamanujanNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  number  :  ");
		int number = sc.nextInt();

		if (isRamanujanNumber(number)) {
			System.out.println(number + " is a Ramanujan number.");
		} else {
			System.out.println(number + " is not a Ramanujan number.");
		}
	}

	public static boolean isRamanujanNumber(int n) {
		int count = 0;
		int limit = (int) Math.cbrt(n);
		for (int i = 1; i <= limit; i++) {
			for (int j = i + 1; j <= limit; j++) {
				int sum = (int) (Math.pow(i, 3) + Math.pow(j, 3));
				if (sum == n) {
					count++;
					if (count == 2) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
