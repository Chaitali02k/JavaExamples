
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		
		char[] ch=str.toCharArray();
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
		}
		
		StringBuffer name=new StringBuffer("Chaita");
		System.out.println(name.reverse());
		
		
		
	}

}
