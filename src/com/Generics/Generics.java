package com.Generics;

public class Generics {
	
   public Integer maxNum(Integer a, Integer b,Integer c) {
		
	   Integer max = a;
		
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		
		return max;
	}


}
