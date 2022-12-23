// Java program to demonstrate working of ConcurrentHashMap

import java.util.concurrent.*;
class ConcurrentHashMapDemo {
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer, String> m =
				new ConcurrentHashMap<Integer, String>();
		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");

		// Printing the ConcurrentHashMap
		System.out.println("ConcurentHashMap: " + m);

		// Adding Hello at 101 key
		// This is already present in ConcurrentHashMap object
		// Therefore its better to use putIfAbsent for such cases
		m.putIfAbsent(101, "Hello");

		// Printing the ConcurrentHashMap
		System.out.println("\nConcurentHashMap: " + m);

		// Trying to remove entry for 101 key
		// since it is present
		m.remove(101, "Geeks");

		// Printing the ConcurrentHashMap
		System.out.println("\nConcurentHashMap: " + m);

		// replacing the value for key 101
		// from "Hello" to "For"
		m.replace(100, "Hello", "For");

		// Printing the ConcurrentHashMap
		System.out.println("\nConcurentHashMap: " + m);
	}
}
