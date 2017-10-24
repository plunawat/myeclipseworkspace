package com.prl;

public class WrapperClass {
	public static void main(String[] args) {
		Double d1 = Double.valueOf(100.98);
		Float f1 = Float.valueOf(12.12F);

		Boolean b1 = new Boolean("trUE");

		System.out.println(new Float("12.3F").parseFloat("10.10"));

		String str = String.valueOf(101134459656L);

		int j = 0;

		for (int i = 0; i < str.length(); i++) {
			j += Character.getNumericValue(str.charAt(i));
		}

		System.out.println(j);
	}

}
