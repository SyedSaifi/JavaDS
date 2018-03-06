package com.example.datastructures;

public class StringReversalUsingRecurssion {
	public static void main(String[] args) {
		System.out.println(reverse("talib"));
	}
	public static String reverse(String str){
		if(str == null || str.length()<=1)
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
	}
}
