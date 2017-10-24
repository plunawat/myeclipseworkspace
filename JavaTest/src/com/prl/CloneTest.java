package com.prl;

public class CloneTest implements Cloneable {
	
	int i1;
	String str1;
	
	public CloneTest(int i1,String str1)	{
		this.i1 = i1;
		this.str1 = str1;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneTest ct1 = new CloneTest(100, "My String 1");
		CloneTest ct2 = (CloneTest)ct1.clone();
		
		System.out.println(ct2.i1+" "+ct2.str1);
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException	{
		return super.clone();
		
	}

}
