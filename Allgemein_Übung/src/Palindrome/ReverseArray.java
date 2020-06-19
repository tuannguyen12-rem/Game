package Palindrome;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]){
		String [] names = {"John","Jammy","Luke"};
		System.out.println("orginal array :"+ Arrays.toString(names));
		// reversing array with three elements
		
		reverse(names);
		System.out.println("reversed array :"+ Arrays.toString(names));
		
		String [] test = {"John"};
	    System.out.println("orginal array :"+ Arrays.toString(test));
	    
	    // testing reverse array funtion with array of just one element
       reverse(test);
       System.out.println("reversed array :"+ Arrays.toString(test));
	
	}
	private static void reverse(String[] array) {
		// TODO Auto-generated method stub
		if(array == null || array.length <2) {
			return;
		}
		for(int i = 0; i< array.length /2;i++) {
			String temp = array[i];
			array[i] = array[array.length -1- i];
			array[array.length-1-i] = temp;
		}
	}
}
