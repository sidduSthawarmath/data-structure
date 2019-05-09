package com.siddu.stack;

import java.util.Stack;

//Java program to reverse individual words in a given string
public class ReverseWords {

	public static void reverseIndividualWords(String str) {
		Stack stack = new Stack();

		char[] charOfStr = str.toCharArray(); // str to array of chars

		// Loop every char
		for (char individualChar : charOfStr) {
			// Push to stack until ' ' space will come
			if (individualChar != ' ') {
				stack.push(individualChar);
			} else {
				// When empty space comes pop all the chars of stack
				while (!stack.isEmpty()) {
					System.out.print(stack.pop());
				}

				System.out.print(" ");
			}
		}
		// For last word there will be no space. So need to pop last word from
		// the stack
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

	public static void main(String[] args) {
		String str = "Java program to reverse individual words in a given string";
		reverseIndividualWords(str);
	}
}
