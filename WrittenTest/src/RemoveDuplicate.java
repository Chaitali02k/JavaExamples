
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();

		for (char c : chars) {
			// charSet.add(c);
			charSet.add(Character.valueOf(c));

		}

		System.out.println(charSet.toString());
	}

}

// StringBuilder sb = new StringBuilder();
// for (Character character : charSet) {
// sb.append(character);
// }
