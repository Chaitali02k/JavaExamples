package com.numberprogram;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime = true;
		
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);		
		int num = input.nextInt();

		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}

		}

		if (isPrime) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}

}
