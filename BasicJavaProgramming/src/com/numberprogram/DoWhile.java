package com.numberprogram;

public class DoWhile {

	final static short x = 2;
	public static int y = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 1, j = 10;
		// do
		// {
		// if(i++ > --j) /* Line 4 */
		// {
		// continue;
		// }
		// } while (i < 5);
		// System.out.println("i = " + i + "and j = " + j); /* Line 9 */

		// float f1[ ], f2[ ];
		// f1 = new float[10];
		// f2 = f1;
		// System.out.println("f2[0] = " + f2[0]);

		int x = 0;
		int y = 0;
		for (int z = 0; z < 5; z++) {
			
			if ((++x > 2) || (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + " " + y);

		// {
		// for (int z = 0; z < 3; z++) {
		// switch (z) {
		// case x:
		// System.out.print("0 ");
		// break;
		// case x - 1:
		// System.out.print("1 ");
		// break;
		// case x - 2:
		// System.out.print("2 ");
		// break;
		// }
		// }
	}

}
