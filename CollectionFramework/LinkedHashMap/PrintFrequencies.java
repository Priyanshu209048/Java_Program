package com.CollectionFramework.LinkedHashMap;

import java.util.*;

public class PrintFrequencies {

	static void print(int arr[]) {

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 10, 20 };
		print(arr);

	}

}
