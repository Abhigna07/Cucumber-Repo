package javaPrograms;

import java.util.HashMap;

public class FrequencyOfLetters {
	
public static void frequencyOfAlphabets(String value)
{	
char splitchars[] =value.toCharArray();

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
	
}



public static void frequencyWithoutCollections(String letter)


{
	
	char splitchars[] =letter.toCharArray();

	 int size[] = new int [26];


}

	public static void main(String[] args) {
		
		
		frequencyOfAlphabets("TarunTatikonda");

	}

}
