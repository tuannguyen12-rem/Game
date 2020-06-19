import java.util.Scanner;

public class Rekursion {
    public static Scanner sc = new Scanner (System.in);     
	
		
	public static void main (String [] args) {
		System.out.printf("Geben Sie eine N Zahl ein:");
		int n = sc.nextInt();
		double value = 0.0 ;
		for(int i =2; i<=n;i++) {
		
			value = value + 1/(double)((i-1)*i);
			 
		}
		 System.out.println("Der Wert des Gleichung = " + value);
	
	}
}
