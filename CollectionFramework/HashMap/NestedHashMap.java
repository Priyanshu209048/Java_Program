package com.CollectionFramework.HashMap;

import java.util.*;

public class NestedHashMap {

	public static void main(String[] args) {

		Map<String, Map<String, String>> map = new HashMap<>();

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Priyanshu", "Baral");
		map1.put("Nitin", "Kumar");
		map1.put("Ashish", "Mishra");

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("Abhishek", "Mishra");
		map2.put("Shubham", "Ghosh");
		map2.put("Rajendra", "Prasad");

		map.put("SAITM", map1);
		map.put("CU", map2);
		System.out.println(map);

	}

}
