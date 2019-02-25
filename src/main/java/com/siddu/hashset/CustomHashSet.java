package com.siddu.hashset;

import java.util.HashMap;
import java.util.Iterator;

public class CustomHashSet {
	private transient HashMap map;

	private static final Object PRESENT = new Object();

	public CustomHashSet() {
		map = new HashMap(10);
	}

	public boolean add(Object key) {
		System.out.println(key + " added element to set");
		return map.put(key, PRESENT) == null;
	}

	public Object remove(Object key) {
		System.out.println("\n" + key + " removed element from set");
		return map.remove(key);
	}

	public Object get(Object e) {
		return map.get(e);
	}

	public Iterator iterator() {
		return map.keySet().iterator();
	}

	public void display() {
		System.out.println("\nAll elements from the set");
		Iterator iterator = iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
	}

	public static void main(String[] args) {
		CustomHashSet customHashSet = new CustomHashSet();
		customHashSet.add(10);
		customHashSet.add(20);
		customHashSet.display();

		Object ob = customHashSet.get(0);
		System.out.println(ob);
		customHashSet.remove(10);
		customHashSet.display();
	}
}