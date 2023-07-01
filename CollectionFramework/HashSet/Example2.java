package com.CollectionFramework.HashSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void print(Collection<?> s) {

		// O(1)
		System.out.println(s.size());

		// O(1)
		s.remove("MY");
		System.out.println(s.size());

		for (Object x : s) {
			System.out.print(x + " ");
		}

		System.out.println();

		// O(1)
		s.clear();
		System.out.println(s.isEmpty()); // O(1)

	}

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();

		s.add("My");
		s.add("Name");
		s.add("Is");
		s.add("Priyanshu");

		print(s);

	}

}
