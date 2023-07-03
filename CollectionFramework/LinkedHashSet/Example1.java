package com.CollectionFramework.LinkedHashSet;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {

		Set<String> lh = new LinkedHashSet<>();

		lh.add("My");
		lh.add("Name");
		lh.add("Is");
		lh.add("Priyanshu");
		System.out.println(lh);

		lh.remove("My");
		lh.add("My");
		System.out.println(lh);

	}

}
