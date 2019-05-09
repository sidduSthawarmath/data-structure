package com.siddu.stack;

import java.util.Stack;

public class DeleteGivenElementFromStack {

	public static void main(String[] args) {
		
		//Stack created with elements
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		
		int removeElement = 30; //Remove 30 from stack
		int size = stack.size(); 
		
		//Delete element from stack logic
		deleteElement(stack, 0, size, removeElement);

		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+"\t");
		}
	}

	private static void deleteElement(Stack<Integer> stack, int current, int size, int removeElement) {

		//calling recursion until  all elements get loop
		if (current == size) {
			return;
		}
		
		//remove the first element and storing in temp
		int element = stack.pop();
		//call the method in recursion way by incrementing current size
		deleteElement(stack, current + 1, size, removeElement);

		//if element is match with 30 we will not store into the stack
		if (element != removeElement) {
			stack.push(element);
		}

	}

}
