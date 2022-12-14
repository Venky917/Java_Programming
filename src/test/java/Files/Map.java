package Files;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable map = new Hashtable();
		map.put(0, "HashTree");
		map.put(1, "HashTable");
		map.remove(0);
		
		Set s =map.entrySet();
		Iterator i =s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
