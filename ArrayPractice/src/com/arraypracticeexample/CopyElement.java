package com.arraypracticeexample;

import java.util.Arrays;

public class CopyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value=new int[2];
	    value[0]=1;
	    value[1]=2;
	   
	    System.out.println(value[1]);
	    
		String[] myFirstSentense= {"Hello", "Good Morning", "Germany"};
		String[] mySecondSentense= Arrays.copyOf(myFirstSentense, myFirstSentense.length);
		
		
		System.out.println("My first sentence is:"+Arrays.toString(myFirstSentense));
		System.out.println("My second sentence is:"+Arrays.toString(mySecondSentense));
		
		int[] myFirstValue= {1,2,4,6,7,8};
		
		int[] mySecondValue=Arrays.copyOf(myFirstValue,3);
		
		System.out.println(Arrays.toString(mySecondValue));
		
		System.out.println(Arrays.toString(mySecondValue));	

	}

}
