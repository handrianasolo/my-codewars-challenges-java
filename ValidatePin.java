package validatePinCode;

public class ValidatePin {
	public static boolean validatePin(String pin) {
        
		boolean isCorrectPin = false;
		if(pin.length() == 4 || pin.length() == 6){
			
			isCorrectPin= pin.matches("[0-9]{1,}");
			
			}else{
				isCorrectPin=false;
		}
		
		return isCorrectPin;
	}
	
	public static void main(String[] args) {
		boolean test = validatePin("123456");
		System.out.println(test);
		
		int[] numb = new int[] {1,2,3,4};
		
		for(int i = 0; i<numb.length; i++) {
			System.out.println(numb[i]);
		}

	}

}
