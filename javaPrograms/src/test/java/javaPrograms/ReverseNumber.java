package javaPrograms;

public class ReverseNumber {

	static int  rem=0, reversenum=0;
	
	public static void reversal(int number)
	
	{
		while(number!=0)
			
		{
		rem=number%10;
		reversenum= reversenum*10 + rem;
		number=number/10;
		
		}
		
		System.out.println(reversenum);
		
	}
	
	
	public static void main(String[] args) {
		
		reversal(12389707);

	}

}
