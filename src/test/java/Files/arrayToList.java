package Files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayToList {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
	String	str[] = {"abc","sdsd","grtt","weew"};
	String str2 = "Venkatesh is Learning programming";
	
//     List convertedList	 = convertToList(str);
//     System.out.println(convertedList);
//     
//    List SplitList =  ListSplit(str2);
//    System.out.println(SplitList.contains("Venkatesh"));
//    System.out.println(SplitList.size());
//    System.out.println(SplitList.indexOf("Learning"));
//    System.out.println(SplitList.remove(0));

   
   
   
   
   List<Integer> intlist2 =  new ArrayList<Integer>();
   
   Scanner sc =new Scanner(System.in);
   int a = sc.nextInt();
   intlist2.add(a);
   int ab = sc.nextInt();
   intlist2.add(ab);
   int abc = sc.nextInt();
   intlist2.add(abc);
   
   System.out.println(intlist2);
   
	}

	

	private static List ListSplit(String str2) {
		
		List<String> l = new ArrayList<String>();
		String[] l2 = str2.split(" ");
		
		l =  Arrays.asList(l2);
		return l;
		
		
		// TODO Auto-generated method stub
		
	}

	private static List convertToList(String[] str) {
		
		
		List a = new ArrayList();
		a = Arrays.asList(str);
		
		return a;
		// TODO Auto-generated method stub
		
	}

}
