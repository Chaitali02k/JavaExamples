package collectionExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashAndTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset = new HashSet<String>();

		hashset.add("dog");
		hashset.add("cat");
		hashset.add("tiger");

		System.out.println("Animals are" + hashset);

		Set<String> names = new TreeSet<String>(hashset);
		for (String name : names) {
			System.out.println(name);
		}

	}

}
