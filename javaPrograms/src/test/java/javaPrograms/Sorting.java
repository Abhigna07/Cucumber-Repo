package javaPrograms;

public class Sorting {
	
	
	public static void sortLogic(int[]numbers)
	
	{
		
		
		for(int i =0; i< numbers.length ; i++)
			
		{
			
			for(int j=i+1 ; j<numbers.length;j++)
				
			{
				
				int temp =0;
				
				if(numbers[j]<numbers[i])
					
				{
					
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j]= temp;
					
				}
				
				
			
				
			}
			
			System.out.println(numbers[i]);
		}
		

		
	}

	public static void main(String[] args) {

		int numbersToSort[] = {3,4,7,2};

		sortLogic(numbersToSort);
		
	}

}
