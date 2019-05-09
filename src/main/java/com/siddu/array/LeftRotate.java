package com.siddu.array;

/*Reversal algorithm for array rotation*/
public class LeftRotate {

	public static void main(String[] args) {
		// data need to reverse
		int data[] = { 4, 1, 4, 4, 0, 5, 6 };

		// d number need to be left rotate
		int d = 3;
		System.out.println("Before Rotate : " + printArray(data));
		leftRotate(data, d);
		System.out.println("After Rotate  : " + printArray(data));

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i; j < data.length - 1; j++) {
				if (data[i] + data[j] == 5 && i != j) {
					System.out.println("(" + data[i] + " + " + data[j] + ")==5");
				}
			}
		}

	}

	// left rotate
	private static void leftRotate(int[] data, int d) {

		// Reverse A to get ArB, where Ar is reverse of A.
		rotateArray(0, d - 1, data);

		// Reverse B to get ArBr, where Br is reverse of B.
		rotateArray(d, data.length - 1, data);

		// Reverse all to get (ArBr) r = BA.
		rotateArray(0, data.length - 1, data);
	}

	/* Function to reverse arr[] from index start to end */
	private static void rotateArray(int start, int end, int data[]) {
		int temp;
		while (start < end) {
			temp = data[start];
			data[start] = data[end];
			data[end] = temp;
			start++;
			end--;
		}
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
