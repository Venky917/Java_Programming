package Files;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReverseEachword {
	
	public static void main(String[] args) {
		
		String str = "Perfaware is my second Company";
		
		
		
				
		String[] str3 = str.split(" ");
		List<String> li = Arrays.asList(str3);
		
		Iterator i3 = li.iterator();
		
		while(i3.hasNext()) {
			
			String str4 = (String) i3.next();
			int len = str4.length();
			
			char[] str5 = str4.toCharArray();
			
			for(int i=len-1;i>-1;i--) {
				
				System.out.print(str5[i]+"");
				
			}
			
			
//			StringBuilder str2 = new StringBuilder(str4);
//			str2 = str2.reverse();
//			System.out.print(str2+" ");
		}
	}

}
