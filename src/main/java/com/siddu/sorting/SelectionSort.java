package com.siddu.sorting;

import java.util.Arrays;

// 1.Find the minimum element in the list.
// 2.Swap minimum element with current element.
// 3.Repeat the whole process until array is fully sorted.

public class SelectionSort {

	public static void main(String a[]) {

		int[] data = { 10, 40, 35, 63, 3 };
		System.out.println("Before sort of elements");
		System.out.println(Arrays.toString(data));

		for (int i = 0; i < data.length; i++) {
			// considering the i as smallest element index
			int smalletstNumIndex = i;

			// looping each elements
			for (int j = i; j < data.length; j++) {

				// comparing the each element if smallest element index find
				// then assign to i.
				if (data[i] > data[j]) {
					smalletstNumIndex = j;
				}

				// for each iteration we find smallest element index. then
				// replace element with i'th location
				int temp = data[i];
				data[i] = data[smalletstNumIndex];
				data[smalletstNumIndex] = temp;

			}

		}

		System.out.println("After sort of elements");
		System.out.println(Arrays.toString(data));

	}
}
