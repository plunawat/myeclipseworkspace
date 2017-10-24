package com.prl;

import java.io.IOException;

public class OOpsTest {
	public static void main(String[] args) {
		B1 b = new B1(10);
		b.xyz();
	}
}

class A1 {

	static int i1 = 100;

	public A1(int i) {
		System.out.println("No-Arg constructor called from A");
	}

	public void abc() throws Exception {

	}
}

class B1 extends A1 {

	public B1(int i) {
		super(10);
	}

	public B1() {
		super(10);
	}

	public void xyz() {
		System.out.println(super.i1);
	}

	public void abc(int i) throws IOException {
		
	}
}
