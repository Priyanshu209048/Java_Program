package com.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrintIterator {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>();
		a1.add(3);
		a1.add(33);
		a1.add(37);
		a1.add(47);
		a1.add(45);
		a1.add(36);

		ListIterator<Integer> li = a1.listIterator();

		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println();

		while (li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}

	}

}
