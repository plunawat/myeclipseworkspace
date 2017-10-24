package com.prl;

import java.util.ArrayList;
import java.util.List;

public class GridTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("91");
		System.out.println(sb.length());
		System.out.print(sb.length() + " " + sb + " ");
		sb.insert(0, "abcdef");
		sb.append("789");
		System.out.println(sb.length() + " " + sb);
		}

}
