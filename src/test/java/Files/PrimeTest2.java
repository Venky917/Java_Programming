package Files;

public class PrimeTest2 {

	public static void main(String[] args) {
		
		int i,j,check,f=0;
		
		for(i=2;i<=800;i++) {
			
			check=0;
			for(j=2;j<i;j++) 
			{
				
				if(i%j==0) {
					check++;
					break;
				}
			}
			if(check==0) 
				f++;
				System.out.println(i);
			
			
		}
		System.out.println(" "+f+" ");
		
	}
	
}
