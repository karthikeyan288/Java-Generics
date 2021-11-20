package com.Generics;

public class Generics {

	public String maxString(String a, String b, String c) {

		String max = a;

		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		return max;
	}

}