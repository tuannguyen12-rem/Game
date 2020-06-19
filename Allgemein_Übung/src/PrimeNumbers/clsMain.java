package PrimeNumbers;

import java.util.Scanner;

public class clsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int number = Integer.MAX_VALUE;
         System.out.println("Enter number to check if prime or not");
         while(number !=0) {
        	 number = sc.nextInt();
        	 System.out.printf(" Does %d a prime ? %s ",number,isPrimeOrnot(number));
         }
         
	}
	// to checkk if an inteer number is prime or not
	// return true uf number is prime , else false
	
	//public static boolean isPrime(int number) {
		//int sqrt =(int)Math.sqrt(number)+1;
		//for(int i= 2;i<sqrt;i++) {
			//if(number % i== 0) {
				//return false;
			//}
		//}
		//return true;
	//}
	
//	public static boolean isPrimeNumber (int number) {
	//	if(number ==2 || number ==3) {
	//		return true;
		//}
		//if(number % 2==0) {
		//	return false;
	//	}
	//	int sqrt = (int) Math.sqrt(number)+1;
		//for(int i =3; i<sqrt;i++) {
			//if(number % i==0) {
				//return false;
			//}
		//}
		//return true;
	//}
	// THird way to check if a number is prime or not
	public static String isPrimeOrnot(int number) {
		if(number <0) {
			return "not valid";
		}
		if(number ==0 || number ==1){
			return "not prime";
		}
		if(number ==2 || number == 3) {
			return " prime number";
		}
		if((number * number -1) % 24 ==0) {
			return "prime";
			
		}else {
			return "not prime";
		}
	}

}
