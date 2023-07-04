package com.CollectionFramework.LinkedHashSet;

import java.util.*;

public class PrintDistinctElement {

	public static Set<Integer> print(int arr[]) {

		Set<Integer> ls = new LinkedHashSet<>();
		for (Integer x : arr) {
			ls.add(x);
		}

		return ls;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 8, 6, 4 };
		Set<Integer> s = print(arr);

		// System.out.println(s);

		for (Integer it : s) {
			System.out.print(it + " ");
		}

	}

}
