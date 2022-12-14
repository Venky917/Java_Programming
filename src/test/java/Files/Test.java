package Files;

public class Test {

	public static void main(String[] args) {
		
		String str = "I am Venkatesh";
		
		String[] str2 = str.split(" ");
		int n = str2.length;
		for(int j=n-1;j>-1;j--) {
			
			System.out.println(str2[j]);
		}
		
		
	}
}
