package com.prl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramTest {
	public static void main(String[] args) {
		String str1 = "Army";
		String str2 = "Mary";
		
		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))	{
			System.out.println("Strings are anagrams");
		} else	{
			System.out.println("Strings are not anagrams");
		}
		
		
		
	}

}
