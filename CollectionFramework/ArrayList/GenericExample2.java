package com.CollectionFramework.ArrayList;

class Pair<T, S> {
	T x;
	S y;
}

public class GenericExample2 {

	public static void main(String[] args) {

		Pair<Integer, String> p = new Pair<>();

		p.x = 12;
		p.y = "Priyanshu";

//		String str = (String)p.x;  //Type Safe: It tells the error at compile time.

		System.out.println(p.x);

	}

}
