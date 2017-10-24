package com.prl;

import static com.prl2.MyTestClass.i1;

import com.prl2.MyTestClass;

public class MiscTest implements other, I1, I2, I1.I3 {

	public static void main(String[] args) {

		A99 a1 = new B99();
		a1.abc();
		
		int i1 = 9;
		int i2 = 016;
		System.out.println(i2);
		System.out.println(Integer.toHexString(i1));
		System.out.println(Integer.toOctalString(i1));
	}

	public int[][] abcd() {
		return new int[][] {};
	}

	@Override
	public void defaultMethod() {
		System.out.println("From implementing class");
	}

	@Override
	public int xyz() {
		return 200;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		I1.super.method1();
	}
}

abstract class A9 {

	abstract void ggg();

}

class Parent1 {

	public Parent1() {
		System.out.println("Parent 1 default constructor executed");
	}

}

class Child1 extends Parent1 implements other {
	static {
		System.out.println("Child1 static initializer executed");
	}

	{
		System.out.println("Child1 initializer executed");
	}

	public void TZY() {
		System.out.println("Downcasting nailed!!!");
	}

	@Override
	public int xyz() {
		return 0;
		// TODO Auto-generated method stub
	}
}

interface other {
	public int xyz();

	default void defaultMethod() {
		System.out.println("Interface's default method");
	}

	static void staticMethod() {
		System.out.println("Interface's static method");

	}

	int a = 100;
}

interface I1 {

	interface I3 {

	}

	default void method1() {
		System.out.println("From interface I1");
	}
}

interface I2 {
	default void method1() {
		System.out.println("From interface I2");
	}
}

class A99 {
	public static void abc() {
		System.out.println("Method from A99 invoked...");
	}
}

class B99 extends A99 {

	
	public static void abc() {
		System.out.println("Heyyyy");
	}
}