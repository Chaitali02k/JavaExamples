
public class ReplaceCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String replaceString = removeChar("abc", 'c');
		System.out.println(replaceString);

	}

	private static String removeChar(String str, char c) {
		// TODO Auto-generated method stub
		if (str == null)
			return null;
		return str.replaceAll(Character.toString(c), "");

	}

}
