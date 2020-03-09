package dubstep;

public class Dubstep {
	
	public static String SongDecoder(String song){
	    String realSong = song.replaceAll("(WUB)+", " ").trim();
	   return realSong;
	}
	
	
	public static void main(String[] args) {
		String test = SongDecoder("WUBIWUBAMWUBAWUBJUNIORWUBDEVELOPERWUB");
		System.out.println(test);

	}

}
