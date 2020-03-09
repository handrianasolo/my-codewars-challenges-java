package highestLowest;

public class HighestLowestNb {

	public static String highestLowestNb(String numbers) {
		String[] singleNumbers = numbers.split(" ");
		int maxValue = Integer.parseInt(singleNumbers[0]);
		int minValue = Integer.parseInt(singleNumbers[1]);
		
		for(int i=0; i<singleNumbers.length; i++) {
			if(Integer.parseInt(singleNumbers[i]) > maxValue) {
				maxValue = Integer.parseInt(singleNumbers[i]);
			}
			
			if(Integer.parseInt(singleNumbers[i]) < minValue) {
				minValue = Integer.parseInt(singleNumbers[i]);
			}
		}
		
		String result = String.valueOf(maxValue) + " " + String.valueOf(minValue);		
		
		return result;
	}
	
	public static void main(String[] args) {
		String test = highestLowestNb("1 2 -3 4 5 6 7");
		System.out.println(test);
	}

}
