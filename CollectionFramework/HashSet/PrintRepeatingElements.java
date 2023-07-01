package com.CollectionFramework.HashSet;

import java.util.*;

public class PrintRepeatingElements {

	public static void print(int arr[]) {

		Set<Integer> ls = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (ls.contains(arr[i]) == true)
				System.out.print(arr[i] + " ");
			else
				ls.add(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 8, 6, 4, 8 };

		print(arr);

	}

}
