
public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		// using replaceAll method
        String str = "Hello Germany";
//
//		String newString = str.replaceAll("\\s", "");
//		System.out.println(newString);

		// without replaceAll method
		char[] strArray = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}

		System.out.println(sb);

	}

}
