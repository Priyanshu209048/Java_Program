package com.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SmallestElement {

	public static List<Integer> printSmall(int arr[], int x) {

		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= x) {
				al.add(arr[i]);
			}
		}
		return al;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 5, 4, 8, 15, 25 };
		List<Integer> li = printSmall(arr, 10);
		for (Integer it : li) {
			System.out.println(it + " ");
		}
	}

}
