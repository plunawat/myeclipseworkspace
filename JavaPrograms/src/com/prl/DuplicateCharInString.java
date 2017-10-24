package com.prl;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
	
	public static void main(String[] args) {
		String str="javaa";
		
		char[] c1 = str.toCharArray();
		
		Map<Character,Integer> map1 = new HashMap<>();
		
		for(char c2 : c1)	{
			if (map1.containsKey(c2))	{
				map1.put(c2, map1.get(c2)+1);
			} else	{
				map1.put(c2, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map1.entrySet())	{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
