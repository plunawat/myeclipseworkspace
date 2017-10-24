package com.prl;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		Map<Person,String> m1 = new TreeMap<>(new Person("Name1","PAN0001",34));
		m1.put(new Person("Name1","PAN0001",34), "String 1");
		m1.put(new Person("Name2","PAN0002",32), "String 2");
		m1.put(null, "XYZ");
		
		/*Map<ABC,Integer> m2 = new TreeMap<>();
		m2.put(new ABC(), 1);
*/
		System.out.println(m1.size());
		for(Map.Entry<Person,String> entry : m1.entrySet())	{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
	}
}


class ABC	{
	
}

