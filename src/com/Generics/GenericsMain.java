package com.Generics;

import java.util.Scanner;

public class GenericsMain {
	public static String value1;
	public static String value2;
	public static String value3;

	public static void main(String[] args) {
		System.out.println("Enter the float value to get the maximun float value");
		Scanner sc = new Scanner(System.in);
		Generics maximumfloat = new Generics();
		System.out.println("Enter first String:");
		value1 = sc.next();
		System.out.println("Enter second String:");
		value2 = sc.next();
		System.out.println("Enter third String:");
		value3 = sc.next();
		System.out.printf("Maximum Number in %s,%s,%s is %s:", value1, value2, value3,
				maximumfloat.maxString(value1, value2, value3));
	}
}
