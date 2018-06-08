package com.numberprogram;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("number is odd");
		}

	}

}
