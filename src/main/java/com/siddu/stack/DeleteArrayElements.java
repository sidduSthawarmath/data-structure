package com.siddu.stack;

import java.util.Stack;

//Delete array elements which are smaller than next or become smaller
public class DeleteArrayElements {

	// logic for delete array elements which are smaller than next or become
	// smaller
	private static Integer[] deleteArrayElemet(Integer[] data) {
		Stack<Integer> stack = new Stack<Integer>(); // Create empty stack

		stack.push(data[0]); // Store 0th element

		// Looping all the elements from 1th location of array
		for (int i = 1; i < data.length; i++) {

			// removing elements from stack by checking the below condition
			while (!stack.isEmpty() && stack.peek() < data[i]) {
				stack.pop();
			}

			// After above manipulation push elements to stack
			stack.push(data[i]);
		}

		// Storing into array by stack
		Integer[] temp = new Integer[stack.size()];
		for (int i = temp.length - 1; i >= 0; i--) {
			temp[i] = stack.pop();
		}
		// return manipulated array
		return temp;
	}
	

	// Display array elements
	private static String displayElements(Integer[] data) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Integer num : data) {
			stringBuilder.append(num + "\t");
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		Integer data[] = { 20, 10, 25, 50, 40, 35 };
		System.out.println("Before : " + displayElements(data));
		data = deleteArrayElemet(data);
		System.out.println(
				"After delete array elements which are smaller than next or become smaller : " + displayElements(data));
	}

}
