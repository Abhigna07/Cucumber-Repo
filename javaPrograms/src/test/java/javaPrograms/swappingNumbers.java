package javaPrograms;

public class swappingNumbers {
	
	
public static void numbersSwap(int num1 , int num2)

{
	
	System.out.println("Initial num1 " + num1 +" Initial num2 " + num2  );
num1 = num1 + num2;//(2+5)

num2 = num1-num2;//(7-5=2)
num1 = num1-num2 ; //(7-2)

System.out.println("Final num1 " + num1 +" Final num2 " + num2  );

}


	
public static void main(String[] args) {
		
	numbersSwap(2,5);


	}

}
