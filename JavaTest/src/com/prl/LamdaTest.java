package com.prl;

public class LamdaTest {
	public static void main(String[] args) {
		
//		Traditional way to print(Before Java 8)
		(new Printer()	{
			public void justPrint(String str)	{
				System.out.println("Printing... "+str);
			}
		}).justPrint("Parikshit");
		
//		Using Lambda expression
		Printer p1 = (str) -> System.out.println("Printing... "+str);
		p1.justPrint("Parikshit");
		
//		Lambda expression using curly braces (for multiple line)	
		Calculator sum = (i1,i2) -> 	{
				System.out.println("The sum of two number is " + (i1+i2));
				return i1+i2;
		};
		
//		Lambda expression returning value without curly braces 
		Calculator multiply = (i1,i2) ->  i1*i2;
		
//		Lambda expression returning value with curly braces
		Calculator division = (i1,i2) -> {return i2/i1;};
		
//		Usage of interfaces instances defined using lambda expression
		int i3 = sum.mathOperation(100, 900);
		int i4 = multiply.mathOperation(100, 900);
	}
}

 interface Calculator	{
	public int mathOperation(int i1, int i2);
}

interface Printer	{
	public void justPrint(String str);
}
