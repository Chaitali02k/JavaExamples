
public class MaxChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java";
		char[] ch = s1.toCharArray();
		int charCount = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (ch[i] == 'a') {
				charCount++;
				System.out.println("Occurance of character is"+ch[i]);
			}

		}
		System.out.println(charCount);

	}
}
