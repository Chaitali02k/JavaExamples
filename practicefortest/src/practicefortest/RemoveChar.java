package practicefortest;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		char[] ch=str.toCharArray();
		char removeChar='c';
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='c') {
				
				sb.append(str.charAt(i));
				System.out.println(str);
			}
		}
		System.out.println(sb);
		

	}

}
