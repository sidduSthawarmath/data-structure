package com.siddu.hashset;

import javax.swing.text.Element;

import com.siddu.hashmap.CustomHashMap;

public class CustomHashSet {

	int CAPACITY = 10;

	CustomHashMap customHashMap = null;

	final Object DUMMY_OBJECT = new Object();

	public CustomHashSet() {
		customHashMap = new CustomHashMap();
	}

	public void add(Object element) {
		customHashMap.put(element, DUMMY_OBJECT);
	}

	/*public Object get(Object element) {
		return customHashMap.get(element);
	}
	 */
	
	
	public static void main(String[] args) {
		
		CustomHashSet customHashSet=new CustomHashSet();
		customHashSet.add(10);
		customHashSet.add(10);
		customHashSet.add(20);
		
	}
}
