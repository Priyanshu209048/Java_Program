package com.CollectionFramework.HashMap;

import java.util.*;

public class Example1 {

	public static void printIterator(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();

		// Put function
		int input = sc.nextInt();
		while (input-- > 0) {
			int age = sc.nextInt();
			String name = sc.next();
			map.put(age, name);
		}

		// Size function
		System.out.println("Size of the map is " + map.size());

		// Iterator function
		printIterator(map);

		// containsKey() function
		if (map.containsKey(3)) {
			System.out.println("Yes, it contains " + map.containsKey(3));
		} else {
			System.out.println("No, it not contains " + map.containsKey(3));
		}

		// containsValue() function
		if (map.containsValue("Here")) {
			System.out.println("Yes, it contains " + map.containsValue("Here"));
		} else {
			System.out.println("No, it not contains " + map.containsValue("Here"));
		}

		System.out.println("After removing the " + map.remove(1) + " map contains: ");
		printIterator(map);

		System.out.println("Geting the key 5: " + map.get(5));

		sc.close();
	}

}
