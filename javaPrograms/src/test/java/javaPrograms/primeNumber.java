package javaPrograms;

public class primeNumber {
	
public static boolean isPrime=true;
	
	public static void checkPrimeNumber(int number)
	
	{
		
		for(int i =2 ; i<=number/2;i++)
			
		{
			
			if(number%i==0)
			{	isPrime=false;
			System.out.println("Given number is not prime");	
			break;
			
			}
		}
		
if(isPrime)
			
		{
			System.out.println("Given number is prime");	
			
		}
		
	}

	public static void main(String[] args) {
		checkPrimeNumber(28);
		
	
	}

}

