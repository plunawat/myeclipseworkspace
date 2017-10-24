package com.prl;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ObjectMethodsTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Name1","PAN0001",34);
		Person p2 = new Person("Name2","PAN0001",34);
		Person p3 = p1;
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(p1);
		pSet.add(p2);
//		pSet.add(p3);
		pSet.add(null);
		
		System.out.println(pSet.size());
		for(Person p : pSet)	System.out.println(String.valueOf(p));
	}
}

class Person implements Comparator<Person>	{
	private String name;
	private String pan;
	private int age;
	
	public Person(String name,String pan, int age)	{
		this.name = name;
		this.pan = pan;
		this.age = age;
	}

	public int getAge()	{
		return age;
	}
	
	public String getPan()	{
		return pan;
	}
	
	public String getName()	{
		return name;
	}
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.pan.compareTo(o2.pan);
	}
	
/*	@Override
	public String toString()	{
		return name+"-"+pan+"-"+age;
	}*/
}
