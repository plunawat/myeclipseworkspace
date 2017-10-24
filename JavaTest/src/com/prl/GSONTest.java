package com.prl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.google.gson.Gson;

public class GSONTest {
	public static void main(String[] args) throws FileNotFoundException {
		Reader r1 = new FileReader("JsonTestFile.json");
		Gson gSon = new Gson();
		String json = gSon.fromJson(r1, Person11.class).toString();
		System.out.println(json);
		
		Person11 p1 = new Person11("User2",34,"PAN2");
		
		System.out.println(gSon.toJson(p1));
		}
}

class Person11 {
	private String name;
	private int age;
	private String PAN;
	private String[] str = {"A1","B1","C3"};

	Person11(String name, int age, String PAN) {
		this.name = name;
		this.age = age;
		this.PAN = PAN;
	}
	
	public String toString()	{
		return "Person - Name:"+name+" age:"+age+" PAN:"+PAN;
	}
}
