package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		palindrome(isPalindrome("radar"), "radar");
	}
	
	public static boolean isPalindrome(String str) {
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void palindrome(boolean isPalindrome, String confirmedPalindrome) {
		if(isPalindrome) {
			System.out.println(confirmedPalindrome + " is a palindrome");
		}else {
			System.out.println(confirmedPalindrome + " is not a palindrome");
		}
	}

}
