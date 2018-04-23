package com.example.sorting;

public class MyQuickSort {
	public static void main(String a[]) {
		int[] array = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12, 11 };
		quickSort(array, 0, array.length - 1);

		for (int i : array) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private static void quickSort(int[] array, int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[(lowerIndex + higherIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(array, lowerIndex, j);
		if (i < higherIndex)
			quickSort(array, i, higherIndex);
	}
}