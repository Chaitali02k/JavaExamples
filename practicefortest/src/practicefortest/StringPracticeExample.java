package practicefortest;

public class StringPracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Geeks";

		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);

		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("ForGeeks");
		System.out.println(sbl);

	}

}
