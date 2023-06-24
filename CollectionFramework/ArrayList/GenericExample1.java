package com.CollectionFramework.ArrayList;

public class GenericExample1 {

	public static <T> int count(T arr[], T x) {
		int res = 0;
		for (T e : arr) {
			if (e.equals(x)) {
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(count(arr, 10));

	}

}
