package javaPrograms;

public class swapStrings {
	
	public static void swapTwoStrings(String s1 , String s2)
	
	{
		System.out.println("Initial s1: " + s1 + " Initial s2:" + s2 );
		
		s1 = s1+s2;
		
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("Final s1: " + s1 + " Final s2:" + s2 );
		
	}
	

	public static void main(String[] args) {
		
		
		swapTwoStrings("Abhi", "Tarun");

	}

}
