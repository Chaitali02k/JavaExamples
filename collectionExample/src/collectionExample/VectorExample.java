package collectionExample;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		// add elements
		v.add( "rome" );
		v.add( "london" );
		v.add( 1, "berlin" );
				
		// list all elements		
		for (String town : v) {
		System.out.println( town );
		}
		
		//read element
		System.out.print("\n");
		System.out.println( v.get( 2 ));
		
		// remove element
		v.remove( 0 );

	}

}
