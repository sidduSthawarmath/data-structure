package com.siddu.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverseRecursion {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		System.out.println("Before reverse:");
		display(queue);

		// Reverse queue elements
		queue = reverseQueue(queue, 0, queue.size());

		System.out.println("\n\nAfter reverse:");
		display(queue);
	}

	private static Queue<Integer> reverseQueue(Queue<Integer> queue, int index, int size) {

		if (queue.isEmpty()) {
			return null;
		}

		int num = queue.peek();
		queue.remove();

		reverseQueue(queue, index + 1, size);
		queue.add(num);

		return queue;
	}

	public static void display(Queue<Integer> queue) {
		for (Integer num : queue) {
			System.out.print(num + "\t");
		}
	}
}
