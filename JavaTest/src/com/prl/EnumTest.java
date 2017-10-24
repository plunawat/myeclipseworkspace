package com.prl;

enum Level	{
	HIGH(20),MEDIUM(60),LOW(99);
	
	
	Level(int i)	{
//		System.out.println(i);
	}
}

public class EnumTest {
	public static void main(String[] args) {
		
	System.out.println(Level.HIGH.name());
		
		
		for(Level l1 : Level.values())	{
//			System.out.println(l1);
		}
	}
}
