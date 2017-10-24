package com.prl;

public class NestedTest implements A.innerA {

	@Override
	public void innerMethod1() {

	}

	public static void main(String[] args) {
		
		new ABC1(10,20)	{
			{
				
			}
			
		}.abc();

	}

}

interface A {
	public void method1();

	interface innerA {
		public void innerMethod1();
	}

}

class ABC1	{
	
	int i;
	int j;
	
	public ABC1(int i, int j)	{
		this.i = i;
		this.j = j;
	}
	public void abc()	{
		System.out.println(i+" "+j);
	}
}
