package com.prl.cucumberTestNG;


public class MyCalculator {
	
	private int i1;
	private int i2;
	
	public MyCalculator(int i1, int i2)	{
		this.i1 = i1;
		this.i2 = i2;
	}
	
	public int add(int i1,int i2)	{
		return i1+i2;
	}
	
	
	public int multiply()	{
		return i1*i2;
	}

}
