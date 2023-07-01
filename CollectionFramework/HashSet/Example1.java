package com.CollectionFramework.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {

		// HashSet is the collection of unsorted and unique element.
		Set<String> s = new HashSet<>();

		// O(1)
		s.add("My");
		s.add("Name");
		s.add("Is");
		s.add("Priyanshu");

		System.out.println(s);

		// O(1)
		System.out.println(s.contains("Name"));

		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
