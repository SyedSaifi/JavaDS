package com.example.ArrayListHashMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map map1 = new HashMap<>();
		System.out.println("Adding : "+map1.put("1", "1"));
		System.out.println("Adding : "+map1.put("2", "1"));
		System.out.println("Adding : "+map1.put("1", "2"));
		System.out.println("Adding : "+map1.put("1", "1"));
	}

}
