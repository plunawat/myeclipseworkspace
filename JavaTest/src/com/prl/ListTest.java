package com.prl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		int[] i1 = {20,10,13,40,34,12,89,11,9};
		
		for(int i : i1)	{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		Arrays.sort(i1);
		
		for(int i : i1)	{
			System.out.print(i+" ");
		}
		
		System.out.println();

		
		LinkedList<String> list = new LinkedList<String>();
		list.offer("Java");
		list.push("e");
		list.add(1, "Guru");
		list.remove("e");
		System.out.println(list);
		
		List<String> l1 = new ArrayList<>();
		l1.add("String1");
		l1.add("String2");
		l1.add("String3");
		l1.add("String4");
		l1.add("String5");
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		List<String> l2 = new ArrayList<>();
		l2.add("String1");
		l2.add("String2");
		l2.add("String3");
		l2.add("String4");
		l2.add("String5");

		System.out.println(l1.equals(l2));
		
		System.out.println(l1.indexOf("String2"));
		System.out.println(l1.indexOf("String31"));
		
		String[] sa = l1.toArray(new String[] {});
	}

}

