package closestToZero;

import java.util.Arrays;

public class ClosestToZero {
	public static int closestToZero(int[] numbers) { 
		
		Arrays.sort(numbers);
		
	    int closestToZero = numbers[0];
	    
	    if(numbers.length == 0) {
			return closestToZero;
			
		}else{
			for ( int i = 1; i < numbers.length; i++ ){
				if (numbers[i] < closestToZero  
						
						||(Math.abs(closestToZero) == Math.abs(numbers[i]) && closestToZero < numbers[i])
						
						||(Math.abs(numbers[i]) < Math.abs(closestToZero) && closestToZero < 0 && numbers[i] < 0)) {
		        	
						closestToZero = numbers[i];
		        }
		    }
		}
	    
	    return closestToZero;
	}

	public static void main(String[] args) {
	    int[] testArray = {3, -3, 1, -1, 99, 7, 98, 65};
	    int result = closestToZero(testArray);
	    System.out.println(result);
	}
}
