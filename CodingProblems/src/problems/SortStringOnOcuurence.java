package problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortStringOnOcuurence {
	public static String SortedSolution1(String input)
	{
		
		HashMap<Character, Integer> charCountMap=new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++)
		{
			
			if(charCountMap.containsKey(input.charAt(i)))
			{
				Integer count=charCountMap.get(Character.valueOf(input.charAt(i)));
				count=count+1;
				charCountMap.put(Character.valueOf(input.charAt(i)), count);
			}
			else
			{
				charCountMap.put(Character.valueOf(input.charAt(i)), 1);
			}
		 
		}
		
		String output = "";
		
		while (!charCountMap.isEmpty()) {
			Character c = Collections.max(charCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();
			Integer v = Collections.max(charCountMap.entrySet(), Map.Entry.comparingByValue()).getValue();
			
			while (v > 0) {
				output += c;
				v--;
			}
			
			charCountMap.remove(c);
		}
		return output;
	
	}  
}
