package javaPrograms;

public class SumOfDigits {
	
	static int rem=0, sum=0;
	
	public static void sumAllDigits(int sumNum)
	
	{
		while(sumNum!=0)
			
		{
		rem= sumNum%10;
		sum = sum+rem;
		sumNum=sumNum/10;			
		}
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		sumAllDigits(123);

	}

}

