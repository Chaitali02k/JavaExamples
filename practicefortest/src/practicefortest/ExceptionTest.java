package practicefortest;

public class ExceptionTest {

	public static void main(String args[]) {
		try {
			aMethod();
		} catch (Exception e) /* Line 20 */
		{
			System.out.print("exception ");
		}
		System.out.print("finished"); /* Line 24 */
	}

	private static void aMethod() throws Exception {
		// TODO Auto-generated method stub
		try /* Line 5 */
		{
			throw new Exception("This is an Exception"); /* Line 7 */
		} finally /* Line 9 */
		{
			System.out.print("finally "); /* Line 11 */
		}

	}

}
