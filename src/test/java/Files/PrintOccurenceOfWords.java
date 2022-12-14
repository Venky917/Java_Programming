package Files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintOccurenceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "words words are very powerful Violence is not powerful than words";
		int k=0;
		
		String[] str2 = str.split(" ");
		
		List<String> countwords = new ArrayList<String> ();
		
		countwords = Arrays.asList(str2);
		
		int m = countwords.size();
		System.out.println(m);
		
		List ab = new ArrayList();
		
		for(int i=0;i<m;i++) {
			k=0;
			
			 if(!ab.contains(countwords.get(i)))
			 {
				 ab.add(countwords.get(i));
				 k++;
			 for(int j=i+1;j<m;j++) {
				 
			 
			if((countwords.get(j)).equals((countwords.get(i)))) {
				
				k++;
				
			}
		}System.out.println(countwords.get(i)+" "+k);
		}
	}

}
}