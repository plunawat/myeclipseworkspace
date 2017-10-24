package com.prl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str = "JJaaBaaBBchd";
		
		char c1[] = str.toCharArray();
		
		for(int i=0;i<c1.length;i++)	{
			
			int j = i+1;
			
			if(c1[i] != c1[j])	{
				if(j == (c1.length-1))	{
					System.out.println(c1[j]);
					break;
				}
				if(c1[j] != c1[j+1])	{
					System.out.println(c1[j]);
					break;
				}
			} 
		}	
	}
}
