package com.CustomException;

import java.util.*;

@SuppressWarnings("serial") // This is used to remove the serial warning on MaxAgeException
class MaxAgeException extends Exception {
	MaxAgeException(String message) {
		super(message);
	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		try {
			hand(age);
			scan.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("This is the end of the program");
		}
	}

	public static void hand(int age) throws MaxAgeException {
		if (age > 120) {
			throw new MaxAgeException("Age cannot be greater than 125");
		} else {
			System.out.println("Your age is correct");
		}
	}

}
