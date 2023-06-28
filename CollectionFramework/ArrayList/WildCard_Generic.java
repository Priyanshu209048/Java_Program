package com.CollectionFramework.ArrayList;

import java.util.ArrayList;

class Student {
	void print() {
		System.out.println("Student");
	}
}

class Engineering extends Student {
	void print() {
		System.out.println("Engineering Student");
	}
}

class Management extends Student {
	void print() {
		System.out.println("Management Student");
	}
}

public class WildCard_Generic {

	public static void printStudent(ArrayList<? extends Student> al) {
		for (Student s : al) {
			s.print();
		}
	}

	public static void main(String[] args) {

		ArrayList<Engineering> al1 = new ArrayList<>();
		al1.add(new Engineering());
		al1.add(new Engineering());

		ArrayList<Management> al2 = new ArrayList<>();
		al2.add(new Management());

		printStudent(al1);
		printStudent(al2);

	}

}
