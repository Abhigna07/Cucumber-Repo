package javaPrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateCharactersInString {
	
	
	public static void duplicateCharacs(String dupToFindStr)
	
	{
		
		
		char splitchars[] =dupToFindStr.toCharArray();

		HashMap<Character,Integer> map = new HashMap<>();


			
			for(int i=0;i<splitchars.length;i++)
				
			{
				
				if(map.containsKey(splitchars[i]))
					
				{
					
					map.put(splitchars[i], map.get(splitchars[i])+1);
					
				}
				
				else
					
				{
					
					map.put(splitchars[i],1);
				}
				
			}
			
			System.out.println(map.toString());
			
			
			Set<Character> getKeys=  map.keySet();
			
			for(char getKey:getKeys)
				
			{
			if(map.get(getKey)>1)
				
			{System.out.println(getKey);}
				
			}
			
		}
		
		
		
		
	
	

	public static void main(String[] args) {
	
		
		duplicateCharacs("abhignanakerekanti");

	}

}
