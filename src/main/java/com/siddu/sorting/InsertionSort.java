package com.siddu.sorting;

import java.util.Arrays;

public class InsertionSort {

	/*
	 * Insertion sort works by comparing values at index with all its prior
	 * elements.We place value at the index where there are no lesser value to
	 * the elements. So when you reach last element,we get a sorted array.
	 */
	public static void main(String[] args) {

		int[] data = { 5, 3, 2, 8, 4 };

		for (int i = 1; i < data.length; i++) {
			int j = i - 1;

			int temp=data[i];
			while (j >= 0 && data[j] > temp) {
                  data[j+1]=data[j];
                  j--;
			}
			
			data[j+1]=temp;

		}
		
		System.out.println(Arrays.toString(data));

	}

}
