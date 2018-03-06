package com.example.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		Set<Animal> s = new TreeSet<Animal>();
		Animal a1 = new Animal(87);
		Animal a2 = new Animal(15);
		Animal a3 = new Animal(5);
		Animal a4 = new Animal(5);
		
		s.add(a1);
		s.add(a2);
		s.add(a3);
		s.add(a4);
		
		for(Animal a: s)
		System.out.println(a.getAge());
		
		/*Set<String> s = new TreeSet<String>();

		System.out.println(s.add("aaa"));
		System.out.println(s.add("aa"));
		System.out.println(s.add("aa"));
		System.out.println(s.add("az"));
		System.out.println(s);*/
	}

}

class Animal implements Comparable<Animal>{
	private int age;
	Animal(int age){
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		if(this.getAge()>o.getAge())
			return 1;
		else if(this.getAge()<o.getAge())
			return -1;
		else
		return 0;
	}
	
}
