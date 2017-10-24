package com.prl;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wordcount {
	public static void main(String[] args) {
		String sentence = "This$is$the$test$sentence$$$$$$This$is$the$test$sentence$the$the$thethe$the$the%";
		
		Pattern p1 = Pattern.compile("\\s+");
		Matcher m1 = p1.matcher(sentence);
		
		while(m1.find())	{
			System.out.println(m1.group()+m1.start());
		}
		String[] wordArray = sentence.split("\\$+");
		
		Map<String,Integer>  countMap = new TreeMap<>();
		
		for(int i=0;i<wordArray.length;i++)	{
			String key = wordArray[i];
			
			if(countMap.containsKey(key))	{
				countMap.put(key,countMap.get(key)+1);
			} else	{
				countMap.put(key, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : countMap.entrySet())	{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
		//printRepeatedLetter("abcdefgghhaqwertybc");
	}
	
	public static void printRepeatedLetter(String str){
		char[] letters = str.toCharArray();
		Map<Character,Integer>  countMap = new TreeMap<>();
		
		for(int i=0;i<letters.length;i++)	{
			char key = letters[i];
			
			if(countMap.containsKey(key))	{
				countMap.put(key,countMap.get(key)+1);
			} else	{
				countMap.put(key, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : countMap.entrySet())	{
			if(entry.getValue() > 1)	{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
		}
		
		
	}

}

