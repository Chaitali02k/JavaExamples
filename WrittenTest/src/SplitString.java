
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Chaitali Kulkarni,Teichstraﬂe 4,Dresden";

		String[] word = s1.split(",",3);
		for (String w : word) {
			System.out.println(w);
		}

	}

}
