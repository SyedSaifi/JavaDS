package com.example.sorting;

/*Bubble sort, also referred to as sinking sort, is a simple sorting algorithm that works by repeatedly stepping through 
 * the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass 
 * through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 */
public class MyBubbleSort {

	public static void main(String[] args) {
		int[] array = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

		int n = array.length;
		int temp;

		for (int m = 0; m < n; m++) {
			for (int i = 0; i < n - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}