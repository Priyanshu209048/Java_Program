package com.CollectionFramework.HashMap;

import java.util.*;

public class PrintFrequencies {

	static void print(int arr[]) {
		HashMap<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			int freq = m.get(arr[i]);
			if (freq != -1) {
				System.out.println(arr[i] + " " + freq);
				m.put(arr[i], -1);
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 10, 20 };
		print(arr);

	}

}
