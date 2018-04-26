package com.example.ArrayListHashMap;

import java.util.HashMap;

class HashSetImpl<E> {
	private transient HashMap<E, Object> map;

	private static final Object PRESENT = new Object();

	public HashSetImpl() {
		map = new HashMap<>();
	}

	public boolean add(E e) {
		return map.put(e, PRESENT) == null;
	}

	public int size() {
		return map.size();
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSetImpl<Object> hashset = new HashSetImpl<Object>();
		hashset.add(3);
		hashset.add("Java Hungry");
		hashset.add("Blogspot");
		hashset.add(3); // duplicate elements
		hashset.add("Java Hungry"); // duplicate elements

		System.out.println("Set size is " + hashset.size());
	}
}
