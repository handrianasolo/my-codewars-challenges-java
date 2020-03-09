package findOutlier;

import java.util.ArrayList;

public class FindOutlier {

	public static int find(int[] integers){
		ArrayList<Integer> pair = new ArrayList<Integer>();
		ArrayList<Integer> impair = new ArrayList<Integer>();
		int outlier = 0;
		
		for(int i=0; i<integers.length; i++) {
			if(Math.abs(integers[i]%2)==0) {
				pair.add(integers[i]);
			}
			
			if(Math.abs(integers[i]%2)>0) {
				impair.add(integers[i]);
			}
		}
		
		for(int i=0; i<pair.size(); i++) {
			for(int j=0; j<impair.size(); j++) {
				if(pair.size()<impair.size()) {
					outlier = pair.get(i);
				}else {
					outlier = impair.get(j);
				}
			}
			
		}
		
		return outlier;
	}
	
	
	public static void main(String[] args) {
		int[] integers = new int[] {79, 67, 0, 3, 5, 11, 7, 1};
		int findOutlier = find(integers);
		System.out.println(findOutlier);

	}

}
