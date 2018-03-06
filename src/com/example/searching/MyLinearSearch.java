package com.example.searching;

public class MyLinearSearch {
	 
    public static int linerSearch(int[] arr, int key){
         
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
     
    public static void main(String a[]){
         
        int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 34;
        System.out.println("found at index: "+linerSearch(arr1, searchKey));
    }
}