package com.prl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest1 {
	public static void main(String[] args) {
		String target="87628346828 ";
		
		Pattern p1 = Pattern.compile("[\\d]");
		Matcher m1 = p1.matcher(target);
			
		System.out.println(m1.find());
		System.out.println(m1.group());
		
		while(m1.find())	{
			System.out.println(m1.group()+" "+m1.start());
		}
		
		
		//System.out.println(m1.replaceAll("@"));
	}
}
