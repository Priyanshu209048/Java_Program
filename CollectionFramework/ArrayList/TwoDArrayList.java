package com.CollectionFramework.ArrayList;

import java.util.*;

public class TwoDArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);

		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(40);
		arr2.add(50);
		arr2.add(50);

		ArrayList<Integer> arr3 = new ArrayList<>();
		arr3.add(60);
		arr3.add(70);
		arr3.add(80);

		ArrayList<ArrayList<Integer>> arr4 = new ArrayList<ArrayList<Integer>>();
		arr4.add(arr1);
		arr4.add(arr2);
		arr4.add(arr3);

		System.out.println(arr4);
		System.out.println(arr4.get(0).get(0));
	}

}
