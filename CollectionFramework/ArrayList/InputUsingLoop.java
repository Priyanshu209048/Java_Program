package com.CollectionFramework.ArrayList;

import java.util.*;

public class InputUsingLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add(scan.nextInt());
		}

		for (Integer x : list) {
			System.out.println(x);
		}

		scan.close();

	}

}
