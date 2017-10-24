package com.altimetrik;

import com.google.gson.Gson;

public class TestGSON {

	public static void main(String[] args) {
		Gson gs = new Gson();
		System.out.println(gs.toJson("{\"name\":\"mkyong\",\"age\":35,\"position\":\"Founder\",\"salary\":10000,\"skills\":[\"java\",\"python\",\"shell\"]}"));
	}
}
