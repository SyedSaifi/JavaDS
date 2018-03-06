package com.example.sorting;

public class MySelectionSort {
	 
    public static void main(String a[]){
         
        int[] arr = {10,34,2,56,7,67,88,42};
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            int temp;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            temp = arr[index];  
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for(int i:arr){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}