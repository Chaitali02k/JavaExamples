package com.arraypracticeexample;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		if (numberOrnot(input) && (input.length() == 10)) {
			System.out.println("Number is Valid");
		} else {
			System.out.println("Number is not valid");
		}

	}

	private static boolean numberOrnot(String input) {

		try {
			Integer.parseInt(input);
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
