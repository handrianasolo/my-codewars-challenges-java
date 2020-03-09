package spinning_words;

public class SpinWords {
	
	public static String spinWords(String sentence) {
		  
		  String[] words = sentence.split(" ");
		  String word = null;
		  
		  for(int i=0; i<words.length; i++){
		    word = words[i];
		    if(word.length()>=5){
		      word = new StringBuffer(word).reverse().toString();
		      words[i] = word;
		    }
		  }
		  
		  String result = String.join(" ", words); 
		  
		  return result;
		  
	}
	
	public static void main(String[] args) {
		String test = spinWords("Welcome my friends");
		System.out.println(test);
	}
}
