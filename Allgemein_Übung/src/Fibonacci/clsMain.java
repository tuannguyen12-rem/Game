package Fibonacci;

import java.util.Scanner;

public class clsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter number upto wich Fibonacci : ");
         int number = new Scanner (System.in).nextInt();
         
         System.out.println("Fibonacci series upto "+ number + "numbers");
         for(int i = 1;i<number;i++) {
        	 System.out.print(fibonacci2(i)+ " ");
         }
	}
    public static int fibonacci (int number) {
    	if(number == 1 || number ==2) {
    		return 1;
    	}
    	return fibonacci(number-1) + fibonacci(number -2); // Schwanzrekursion 
    	                                                   // tail recursion
    }
    // to calculate Fibonnacci number using loop oder Iteration
    
    public static int fibonacci2(int number) {
    	if(number == 1 || number ==2) {
    		return 1;
    	}
    	int fibo1 = 1, fibo2 =1 ,fibonacci = 1;
    	for(int i = 3; i<= number;i++) {
    		
    		// Fibonacci number is sum of previous two Fibonacci number
    		fibonacci = fibo1+ fibo2;
    		fibo1 = fibo2;
    	    fibo2 = fibonacci;
    	}
    	return fibonacci;
    }
}
