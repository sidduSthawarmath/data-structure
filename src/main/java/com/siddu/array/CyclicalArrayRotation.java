package com.siddu.array;

//Program to cyclically rotate an array by one
public class CyclicalArrayRotation {
	public static void main(String[] args) {
		// data need to reverse
		int data[] = { 3, 1, 9, 4, 0, 5, 6 };
		System.out.println("Before Rotate : " + printArray(data));
		cyclicalArrayRotationByOneElement(data);
		System.out.println("After Rotate  : " + printArray(data));

	}

	private static void cyclicalArrayRotationByOneElement(int[] data) {
		int temp = data[data.length - 1];
		for (int i = data.length - 1; i > 0; i--) {
			data[i] = data[i - 1];
		}
		data[0] = temp;
	}

	// Print array
	public static String printArray(int data[]) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int element : data) {
			stringBuilder.append(element + "  ");
		}
		return stringBuilder.toString();
	}

}
