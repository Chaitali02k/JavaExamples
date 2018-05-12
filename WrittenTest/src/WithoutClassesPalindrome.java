
public class WithoutClassesPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stringPalindrome = isPalindrome("nitin");
		
		if (stringPalindrome == true) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		
		if (str == null) {
			return false;
		}

		int length = str.length();
		System.out.println(length/2);
		for (int i = 0; i < length / 2; i++) {
			
			if (str.charAt(i) != str.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
