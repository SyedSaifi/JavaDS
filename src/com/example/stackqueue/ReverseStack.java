package com.example.stackqueue;

import java.util.Scanner;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseInput();

	}
	
	public static void reverseInput(){
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i!=-111){
			reverseInput();
			System.out.println(i);
		}
	}

}
