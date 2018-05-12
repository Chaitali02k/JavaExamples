package practicefortest;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// automatic type conversion
		byte b = 127;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println("Byte value " + b);
		System.out.println("Short value " + s);
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
		System.out.println("Double value " + d);

		// explicit type conversion

		byte bValue;
		int iValue = 257; 
        double dValue = 323.142;
        System.out.println("Conversion of int to byte."); 
         
        //i%256
        bValue = (byte) i; 
        System.out.println("i = " + i + " b = " + bValue);
        System.out.println("\nConversion of double to byte.");
         
        //d%256
        bValue = (byte) d; 
        System.out.println("d = " + d + " b= " + bValue);

	}

}
