package com.siddu.sorting;

public class Bubblesort {

	public static void main(String[] args) {

		int[] data = { 10, 40, 35, 63, 3 };
		System.out.println("Before sort of elements");
		displayData(data);
		
		//Each element looping
		for (int i = 0; i < data.length; i++) {
		    //Each element checking with the next other elements for comparing greater/ lesser
			//Each loop one element will get sort out
			for (int j = i; j < data.length; j++) {
				//Comparison if previous is greater then its next element then replace that elements(for ascending order)
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		System.out.println("After sort of elements");
		displayData(data);
	}

	private static void displayData(int[] data) {
		for (int num : data) {
			System.out.print(num + "\n");
		}
	}
}