package javaPrograms;

public class amstromgNumber {
	
	
	static int rem=0, sum =0, validateNumber;
	
	public static void checkAmstrongNumber(int number)
	
	{
		validateNumber=number;
		
		while(number!=0)
			
		{
		
		rem= number%10;
		
		sum= sum +rem*rem*rem;
		
		number=number/10;
	}
		
		if(validateNumber==sum)
			
		{
			
			System.out.println("Given number is an amstromg number");
		}
		
		else
			
		{
			System.out.println("Given number is not an amstromg number");
			
		}
	
	}
	public static void main(String[] args) {
		

		checkAmstrongNumber(152);
		
	}

}
