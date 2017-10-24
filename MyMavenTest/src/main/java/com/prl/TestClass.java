package com.prl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException {

		Person p1 = new Person("Name1", "PAN0001", 34);
		Person p2 = new Person("Name2", "PAN0002", 43);
		Person p3 = p1;

		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();

		Gson gson = builder.create();

		/*
		 * PrintWriter pw = new PrintWriter("Person.json"); pw.write(gson.toJson(p1));
		 * pw.write(gson.toJson(p2)); pw.close();
		 */

		Reader r1 = new BufferedReader(new FileReader("Person.json"));

		JsonParser parser = new JsonParser();
		JsonElement je = parser.parse(r1);

		System.out.println(je.toString());

		JsonObject jo = je.getAsJsonObject();

		Set<Entry<String, JsonElement>> set1 = jo.entrySet();

		System.out.println(jo.get("name"));
		System.out.println(jo.get("pan"));
		System.out.println(jo.get("age"));
		System.out.println(jo.getAsJsonArray("Array1"));

		JsonArray ja = jo.getAsJsonArray("Array1");
		for (JsonElement jee : ja) {
			System.out.println(jee.getAsString());
		}

	}
}

class Person implements Comparator<Person> {
	private String name;
	private String pan;
	private int age;

	public Person(String name, String pan, int age) {
		this.name = name;
		this.pan = pan;
		this.age = age;
	}

	/*
	 * public int getAge() { return age; }
	 * 
	 * public String getPan() { return pan; }
	 * 
	 * public String getName() { return name; }
	 */

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.pan.compareTo(o2.pan);
	}

	@Override
	public String toString() {
		return name + "-" + pan + "-" + age;
	}
}