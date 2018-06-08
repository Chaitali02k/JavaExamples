
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stringPalindrome = isPalindrome("aba");
		if (stringPalindrome == true) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

	private static boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}

		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		System.out.println(strBuilder.toString().equals(str));
		return strBuilder.toString().equals(str);
	}

}
