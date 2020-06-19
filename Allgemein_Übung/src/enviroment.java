import java.util.Arrays;

public class enviroment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int nums [] = {12,23,2,5,4,6,7,89};
	int even_n = 0 , odd_n= 0;
	
	    System.out.println("Original Array . "+ Arrays.toString(nums));
	
	    for(int i = 0; i< nums.length;i++) {
	    	if(nums[i] % 2 ==0) {
	    		even_n ++;
	    		
	    	} else {
	    		odd_n++;
	    	}
	    }
	    System.out.printf("\nNumber of even elements in the array : %d", even_n);
	    System.out.printf("\nNumber of even elements in the array : %d", odd_n);
	    System.out.printf("\n");
	}

}
