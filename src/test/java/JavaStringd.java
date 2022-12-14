import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



import org.testng.annotations.Test;

public class JavaStringd {
	
	@Test(enabled=false)
	public void methods() {
		
		String s1 = "Sachin is God of Cricket";
		StringBuilder s2 = new StringBuilder(s1);
		
		System.out.println(s2);
		
		char[] ch = s1.toCharArray();
		int i = ch.length;
		System.out.println(i);
		for(int j=ch.length-1;j>-1;j--) {
			System.out.print(ch[j]);
			
		}
		
	}
	
	@Test
	public void reverseString() {
		String s1 = "Sachin is God of Cricket";
		char[] ch = s1.toCharArray();
		List s2  = new LinkedList();
		for(char c:ch) {
			s2.add(c);	
		}
		Collections.reverse(s2);
		Iterator i1 =s2.iterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next());
		}
	}
}
