package maskingCreditCard;

public class Maskify {

	public static String maskify(String str) {
	        if (str.length() < 4) {
	            return str;
	            
	        } else {
	            String newStr = "";
	            for (int i = 4; i < str.length(); i++) {
	            	newStr += "#";
	            }
	            
	            newStr += str.substring(str.length() - 4);
	            return newStr;
	        }        	
    }
	
	public static void main(String[] args) {
		String test = maskify("abcd123456788910");
		System.out.println(test);
	}
	
}
