package com.StringToken;

import java.util.StringTokenizer;

public class SToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Hi My name is Priyanshu Baral", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println();

		StringTokenizer st1 = new StringTokenizer("Hi My name is Priyanshu Baral", "@");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println();

		String str1 = "Hey Everyone this my java program";
		StringTokenizer st2 = new StringTokenizer(str1);
		System.out.println(st2.countTokens() + " " + st2.nextToken());

		System.out.println();

		String str2 = "Hey Everyone this my java program";
		StringTokenizer st3 = new StringTokenizer(str2, "y");
		System.out.println(st3.countTokens() + " " + st3.nextToken());

	}

}
