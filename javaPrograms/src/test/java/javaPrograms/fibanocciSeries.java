package javaPrograms;

public class fibanocciSeries {
	
	static int n1=0, n2=1 , n3=0;
	
	
	public static void fibanocciMethod(int number)
	
	{
		
		System.out.print(n1);
		System.out.print(n2);
		
		for(int i=2 ; i<number ; i++)
			
		{
			
			n3= n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(n3);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	fibanocciMethod(10);
		
		
		}

}
