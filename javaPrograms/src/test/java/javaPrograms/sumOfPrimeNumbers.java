package javaPrograms;

public class sumOfPrimeNumbers {
	
	static int sumofprime=0;

public static void sumPrimeNumber(int limit)
	
	{
		
	for(int number = 2;number<=limit ; number++ )
		
	{
	   boolean isPrime=true;
		
		for(int i =2 ; i<=number/2;i++)
			
		{
			
			if(number%i==0)
			{	isPrime=false;
				
			break;
			
			}
		}
		
		if(isPrime)
			
		{
			sumofprime=sumofprime+number;
			
		}
		
	}
	
	System.out.println(sumofprime);
	
	}
	public static void main(String[] args) {
		
		sumPrimeNumber(100);
		
	}

}
