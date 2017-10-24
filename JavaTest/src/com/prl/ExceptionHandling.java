package com.prl;

import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] args) throws MyException {
		System.out.println(abc(500, 10, 5));
		
		new ExceptionHandling().A1();
	}

	static int abc(int i, int j, int k) {

		int[] a = { 1, 2, 3, 4, 5 };
		try {
			throw new SQLException();
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException aie ) {
			return i-j-k;
		}
		
		finally	{
			i= 10000;j=2000;k=30000;
			System.out.println("Finally executed");
			throw new RuntimeException();
//			return 200;
		}
	}
	
	public void A1() throws MyException 	{
		
		B1();
		
	}
	
	public void B1() throws MyException  	{
		throw new MyException2();
	}
}

class MyException extends Exception	{
	
}

class MyException2 extends RuntimeException	{
	
}
