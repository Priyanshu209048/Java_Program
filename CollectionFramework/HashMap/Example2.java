package com.CollectionFramework.HashMap;

import java.util.*;

class UserInput {

	HashMap<Integer, Integer> m;

	UserInput() {
		m = new HashMap<Integer, Integer>();
	}

	int get(int id) {
		return m.get(id);
	}

	void set(int id, int bal) {
		m.put(id, bal);
	}

}

public class Example2 {

	public static void main(String[] args) {

		UserInput users = new UserInput();
		users.set(1, 100);
		users.set(2, 200);
		System.out.println(users.get(1));

		users.set(1, 500);
		System.out.println(users.get(1));

	}

}
