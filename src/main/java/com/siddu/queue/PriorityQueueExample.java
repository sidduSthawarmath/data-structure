package com.siddu.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

//Priority Queue
public class PriorityQueueExample {

	public static void main(String[] args) {

		// Adding integer numbers to queue
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(20);
		priorityQueue.add(4);
		priorityQueue.add(1);
		priorityQueue.add(35);
		priorityQueue.add(24);
		priorityQueue.add(16);

		// While removing elements we are getting elements in ascending order
		System.out.println("Integer sorting :");
		while (!priorityQueue.isEmpty()) {
			System.out.print(priorityQueue.remove() + "\t");
		}
		System.out.println("\n");

		// Priority queue using Comparator
		PriorityQueue<Employee> empQueue = new PriorityQueue<Employee>(new CustomEmployeeComparator());
		// Adding employee object to queue which has custom comparator
		// implementation on empId
		empQueue.add(new Employee(20, "Ramesh"));
		empQueue.add(new Employee(10, "Ganesh"));
		empQueue.add(new Employee(16, "John"));
		empQueue.add(new Employee(15, "Raghav"));

		// while removing employee objects getting based on the empId asc
		System.out.println("Empoyee sorting based on comparator:");
		while (!empQueue.isEmpty()) {
			Employee emp = empQueue.remove();
			System.out.println(emp.empId + " " + emp.name);
		}
	}
}

class Employee {
	int empId;
	String name;

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
}

class CustomEmployeeComparator implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.empId > emp2.empId) {
			return 1;
		} else {
			return -1;
		}
	}

}