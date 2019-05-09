package com.siddu.stack;

import java.util.Stack;

public class StackSort {

	private static Stack<Integer> sortStatck(Stack<Integer> input) {

		// Create empty stack
		Stack<Integer> sortedSatck = new Stack<Integer>();

		// Loop input stack until it will empty
		while (!input.isEmpty()) {
			// Remove the element input stack
			int inputElement = input.pop();

			// check sorted stack value should be > of inputElement otherwise
			// remove from sorted stack and add it to input statck
			while (!sortedSatck.isEmpty() && sortedSatck.peek() > inputElement) {
				input.push(sortedSatck.pop());
			}
			// Add the inputElement to sorted stack
			sortedSatck.push(inputElement);
		}

		return sortedSatck;

	}

	public static void main(String[] args) {

		// Create stack and add elements
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(9);
		stack.push(5);
		stack.push(15);

		// Logic for sorting stack
		Stack<Integer> sortedSatck = StackSort.sortStatck(stack);
		System.out.println("After sort stack :");
		displayStackEklemets(sortedSatck);

	}

	private static void displayStackEklemets(Stack<Integer> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " \t");
		}
	}

}
