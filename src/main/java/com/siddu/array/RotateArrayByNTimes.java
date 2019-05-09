package com.siddu.array;

//Rotate an array by d elements  
public class RotateArrayByNTimes {
	
	public static void main(String[] args) {
		// Array declaration
		int data[] = { 1, 2, 3, 4, 5, 6, 7 };

		RotateArrayByNTimes arrayRotate = new RotateArrayByNTimes();

		// Print array before rotation
		System.out.println("Before Array rotation:\n");
		arrayRotate.printArray(data);

		// calling the rotateNnumOfTimes function
		arrayRotate.rotateNnumOfTimes(data, 2);

		// Print array after rotation
		System.out.println("After Array rotation:\n");
		arrayRotate.printArray(data);
	}

	// Rotate array N num of time and call the leftRotateByOne function each
	// roattion
	public void rotateNnumOfTimes(int[] data, int numOfTimes) {
		for (int i = 1; i <= numOfTimes; i++) {
			leftRotateByOne(data);
		}
	}

	// Shift first element by left
	public void leftRotateByOne(int[] data) {
		int temp = data[0]; // Storing first element in temp value
		for (int i = 0; i < data.length - 1; i++) {
			// shift each element
			data[i] = data[i + 1];
		}
		// store the last index by temp val
		data[data.length - 1] = temp;
	}

	// Print array
	public void printArray(int[] data) {
		for (int num : data) {
			System.out.print(num + "\t");
		}
		System.out.println("\n");
	}

}
