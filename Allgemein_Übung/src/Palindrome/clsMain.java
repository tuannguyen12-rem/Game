package Palindrome;

import java.util.Scanner;

public class clsMain {
	public static void main(String args[]){
		System.out.println("Please enter a number :");
		int palindrome = new Scanner (System.in).nextInt();
		if(isPalindrome(palindrome)) {
		System.out.println("Number :"+ palindrome + " is a palindrome");
		}
		else {
			System.out.println("Number :"+ palindrome + " is  not a palindrome");
		}
	}
	
	// to check if number is palindrome or not
	public static boolean isPalindrome(int number) {
		int palindrome = number ; // copied number into variable 
		
		int  reverse = 0;
	
		
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10+ remainder ;
			palindrome = palindrome /10;
		}
		// if original and reverse of number is equal means number is palindrome in java
		
		if(number == reverse) {
			return true;
		}
		return false;
	}
}
