package com.siddu.hashmap;

public class CustomHashMap<K, V> {
	private Entry<K, V>[] data;
	private static final int INITIAL_CAPACITY = 3; // 16
	private int size = 0;

	public CustomHashMap() {
		this(INITIAL_CAPACITY);
	}

	public CustomHashMap(int capacity) {
		this.data = new Entry[capacity];
	}

	public void put(K key, V value) {
		Entry<K, V> entry = new Entry<K, V>(key, value, null);
		int bucket = getHash(key);
		Entry<K, V> existing = data[bucket];
		if (existing == null) {
			data[bucket] = entry;
			size++;
		} else {
			// compare the keys see if key already exists
			while (existing.next != null) {
				if (existing.key.equals(key)) {
					existing.value = value;
					return;
				}
				existing = existing.next;
			}
			if (existing.key.equals(key)) {
				existing.value = value;
			} else {
				existing.next = entry;
				size++;
			}
		}
	}

	public V get(K key) {
		Entry<K, V> entry = data[getHash(key)];
		while (entry != null) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
		return null;
	}

	public void remove(K key) {
		Entry<K, V>  entry = data[getHash(key)];
		if (entry.key == key) {
			entry = entry.next;
			data[getHash(key)] = entry;
		} else {
			while (entry.next != null && entry.next.key != key) {
				entry = entry.next;
			}
			entry.next = entry.next.next;
		}
	}

	public void display() {
		for (int i = 0; i < data.length; i++) {
			Entry<K, V> existing = data[i];
			while (existing.next != null) {
				existing.displayEntrykeyAndVal();
				existing = existing.next;
			}
			existing.displayEntrykeyAndVal();
		}
	}

	private int getHash(K key) {
		return Math.abs(key.hashCode()) % INITIAL_CAPACITY;
	}

	public static void main(String[] args) {
		CustomHashMap<String, String> myHashMap = new CustomHashMap<String, String>();
		myHashMap.put("Siddu", "100");
		myHashMap.put("Mahesh", "200");
		myHashMap.put("Ganesh", "300");
		myHashMap.put("Ramesh", "100");
		myHashMap.put("Ram", "200");
		myHashMap.put("Siddu", "300");
		System.out.println(myHashMap.get("Siddu"));

		myHashMap.remove("Siddu");

		System.out.println(myHashMap.get("Siddu"));

		System.out.println("Display All elements");
		myHashMap.display();

	}

}

class Entry<K, V> {
	final K key;
	V value;
	Entry<K, V> next;

	public void displayEntrykeyAndVal() {
		System.out.println(key + " : " + value);
	}

	public Entry(K key, V value, Entry<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	// getters, equals, hashCode and toString
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Entry<K, V> getNext() {
		return next;
	}

	public void setNext(Entry<K, V> next) {
		this.next = next;
	}

	public K getKey() {
		return key;
	}

	@Override
	public String toString() {
		return "Entry [key=" + key + ", value=" + value + ", next=" + next + "]";
	}
}
