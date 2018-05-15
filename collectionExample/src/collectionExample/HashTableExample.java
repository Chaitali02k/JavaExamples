package collectionExample;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> phoneBook = new Hashtable<String, Integer>();
		// add entries
		phoneBook.put("chaita", 9440902);
		phoneBook.put("suyog", 550440);
		phoneBook.put("loki", 234567);

		// is a value in the map
		System.out.println("Map contains 'Suyog': " + phoneBook.containsKey("suyog"));

		// get Loki's number:
		System.out.println("Loki’s number is: " + phoneBook.get("loki"));
//
//		// iterate over all entries
//		for (Enumeration<String> names = phoneBook.keys(); names.hasMoreElements();) {
//			String name = names.nextElement();
//			System.out.println(name + ": " + phoneBook.get(name));
//		}
//		
//		// remove element
//		phoneBook.remove("linus");

	}

}
