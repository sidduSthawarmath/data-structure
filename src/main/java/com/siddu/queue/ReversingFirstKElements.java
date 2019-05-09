package com.siddu.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Queue reversal of first Kth elements
public class ReversingFirstKElements {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		int k = 2;
		System.out.println("Before reverse of Kth Elements :");
		display(queue);

		// Reverse queue elements
		queue = reverseFirstKElements(queue, k);

		System.out.println("\n\nAfter reverse of Kth Elements :");
		display(queue);
	}

	private static Queue<Integer> reverseFirstKElements(Queue<Integer> queue, int k) {
		Stack<Integer> stack = new Stack<Integer>();
		// upto kth elements removing from queue and pushed to stack
		for (int i = 0; i < k; i++) {
			stack.push(queue.peek());
			queue.remove();
		}
		// From stack again added to queue(Now its reverse of kth elements in
		// queue)
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		// for making its proper order. removing elements from queue and
		// again adding into queue
		for (int i = 0; i < queue.size() - k; i++) {
			int x = queue.peek();
			queue.remove();
			queue.add(x);
		}
		return queue;
	}

	public static void display(Queue<Integer> queue) {
		for (Integer num : queue) {
			System.out.print(num + "\t");
		}
	}
}
