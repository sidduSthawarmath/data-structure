package com.siddu.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

	private static Queue<Integer> reverseQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!queue.isEmpty()) {
			stack.push(queue.peek());
			queue.remove();
		}

		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		return queue;
	}

	public static void display(Queue<Integer> queue) {
		for (Integer num : queue) {
			System.out.print(num + "\t");
		}
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);

		System.out.println("Before reverse:");
		display(queue);

		// Reverse queue elements
		queue = reverseQueue(queue);

		System.out.println("\n\nAfter reverse:");
		display(queue);
	}

}
