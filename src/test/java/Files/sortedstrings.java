package Files;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.Assert;

public class sortedstrings {

	public static void main(String[] args) {
		
		List original  = new LinkedList();
		
		original.add("one");
		original.add("two");
		original.add("four");
		original.add("big");
		original.add("onion");
		original.add("tree");
		original.add("butterfly");
		original.add("eleven");
		original.add("eight");
		
		List<String> sortedlist = (List) original.stream().sorted().collect(Collectors.toList());
		Object[] str =  sortedlist.toArray();
		
		
		Boolean l = original.stream().anyMatch(s->s.equals("onion"));
		
		original.forEach(
				
				(Object name)->{
					System.out.println(name);
				}
				
				);
		
		
		System.out.println(l);
	System.out.println(str.length);
	System.out.println(sortedlist.size()); 
	}

}
