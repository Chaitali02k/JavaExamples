package collectionExample;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> pizza = new HashSet<String>();
		
		// add entries
		pizza.add("tomato");
		pizza.add("olives");
		pizza.add("anchovies");
		pizza.add("cheese");
		
		// is a value in the map
		//System.out.println( "Does pizza have olives: " + pizza.contains("olives") );
		
		for(Iterator pizzaTopping=pizza.iterator(); pizzaTopping.hasNext();)
		
		
		// iterate over all toppings
		for (Iterator toppings = pizza.iterator(); toppings.hasNext();) {
		String topping = (String) toppings.next();
		System.out.println( "Pizza has: " + topping );
		}
//		
//		// remove element
//		pizza.remove("tomato");

	}

}
