package com.example.datastructures;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInAnArray {
	
	public static void main(String[] args) {
		int[] input = {1,2,3,8,1,4};
        Set tempSet = new HashSet();
        for (int str : input) {
            if (!tempSet.add(str)) {
                System.out.println("Deplicate element is :: "+str);
            }
        }
    }
}



