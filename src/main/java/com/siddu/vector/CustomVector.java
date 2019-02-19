package com.siddu.vector;

/*
 * The vector is same as ArrayList but its add and remove methods are
 * synchronized
 */

public class CustomVector {

	private final int SIZE_FACTOR = 10;

	private int currentSize = 0;

	private int index = 0;

	private static Object data[] = null;

	public CustomVector() {
		data = new Object[SIZE_FACTOR];
		currentSize = SIZE_FACTOR;
	}

	public synchronized void add(Object element) {
		if (index >= data.length) {
			increaseSizeAndReallowcate();
		}
		data[index] = element;
		index++;
		System.out.println(element + " added suucessfully");
	}

	public synchronized void remove(int deleteIndex) {

		if (deleteIndex < 0 || deleteIndex > index - 1) {
			try {
				throw new Exception("ArrayIndexOutOfBound exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			Object temp = data[deleteIndex];
			for (int i = deleteIndex; i < data.length - 1; i++) {
				data[i] = data[i + 1];
			}
			index--;
			System.out.println(temp + " element removed from the vector successfully");
		}
	}

	private void increaseSizeAndReallowcate() {
		currentSize = currentSize + SIZE_FACTOR;
		Object newData[] = new Object[currentSize];
		for (int i = 0; i < data.length - 1; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

	public static void main(String[] args) {
		CustomVector customVector = new CustomVector();
		for (int i = 1; i <= 5; i++) {
			customVector.add(i);
		}
		customVector.remove(6);

	}
}
