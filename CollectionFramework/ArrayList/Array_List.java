package com.CollectionFramework.ArrayList;

import java.util.*;

public class Array_List {

	static void print(Collection<?> a1) {
		Iterator<?> it = a1.iterator();
		while (it.hasNext()) {
			int x = (int) it.next();
			if (x / 10 == 3 || x == 3) {
				System.out.print(x + " ");
			}
		}
	}

//	static void reversePrint(List<Integer> a1) {
//		ListIterator<Integer> itr = a1.listIterator();
//		while (itr.hasPrevious()) {  
//            System.out.println(itr.previous());  
//     }  
//	}

	public static void main(String[] args) {

		List<Integer> a1 = new ArrayList<>();
		a1.add(3);
		a1.add(33);
		a1.add(37);
		a1.add(47);
		a1.add(45);
		a1.add(36);

		print(a1);
		// reversePrint(a1);
		
		System.out.println();

		for(int i=0; i<a1.size(); i++) {
			if(a1.get(i)/10 == 3 || a1.get(i) == 3) {
				System.out.print(a1.get(i) + " ");
			}
		}
//		
//		for (int s : a1) {
//            if(s/10 == 3 || s == 3) {
//            	System.out.print(s + "");
//            }
//        }

	}
}
