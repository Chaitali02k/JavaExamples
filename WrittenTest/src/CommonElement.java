import java.util.Arrays;
import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = { "one", "two", "three", "four" };
		String[] s2 = { "six", "two", "three", "nine" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);

		// with retainAll()
		Integer[] n1 = { 1, 2, 4, 5, 7, 8 };
		Integer[] n2 = { 9, 2, 4, 6, 8 };

		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(n1));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(n2));

		set1.retainAll(set2);
		
		System.out.println(set1);

	}

}
