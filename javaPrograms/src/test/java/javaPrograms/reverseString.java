package javaPrograms;

public class reverseString {
	
	static String rev="";
	
	public static void reverseOfString(String stringValue)
	
	{
		
		char characs[]= stringValue.toCharArray();
		
		for(int i=characs.length-1;i>=0;i--)
			
		{
			
			rev=rev+characs[i];
			
		}
		
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		reverseOfString("Abhigna");

	}

}
