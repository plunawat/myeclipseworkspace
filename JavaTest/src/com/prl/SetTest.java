package com.prl;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		
		Set<Person1> s1 = new HashSet<>();
		Person1 p1 = new Person1("Name1","PAN0001",34);
		Person1 p2 = new Person1("Name2","PAN0001",34);
		Person1 p3 = p1;
		
		Set<String> s2 = new TreeSet<>();
//		s2.add(null);
		
		Set<String> s3 = new LinkedHashSet<>();
		s3.add(null);
		
		System.out.println(s3.iterator().next());
		
		s1.add(p2);
		s1.add(p1);
		s1.add(p3);
		
		Iterator<Person1> i1 = s1.iterator();
		
		while(i1.hasNext())	{
			System.out.println(i1.next().getName());
		}
	}
}

class Person1 implements Comparator<Person>	{
	private String name;
	private String pan;
	private int age;
	
	public Person1(String name,String pan, int age)	{
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
		return 0;
	}
	
	public boolean equals(Person1 p1)	{
		return this.pan.equals(p1.pan);
		
	}
	
/*	@Override
	public String toString()	{
		return name+"-"+pan+"-"+age;
	}*/
}
