// Java program to demonstrate working of HashSet
import java.util.*;

class Test {
	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet using add()
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India"); // adding duplicate elements

		// Displaying the HashSet
		System.out.println(h);

		// Checking if India is present or not
		System.out.println("\nHashSet contains India or not:"
						+ h.contains("India"));

		// Removing items from HashSet using remove()
		h.remove("Australia");

		// Printing the HashSet
		System.out.println("\nList after removing Australia:" + h);

		// Iterating over hash set items
		System.out.println("\nIterating over list:");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
