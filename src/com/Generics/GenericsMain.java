package com.Generics;

import java.util.Scanner;

public class GenericsMain {
	public static float value1;
	public static float value2;
	public static float value3;

	public static void main(String[] args) {
		System.out.println("Enter the float value to get the maximun float value");
		Scanner sc = new Scanner(System.in);
		Generics maximumfloat = new Generics();
		System.out.println("Enter first Number:");
		value1 = sc.nextFloat();
		System.out.println("Enter second Number:");
		value2 = sc.nextFloat();
		System.out.println("Enter third Number:");
		value3 = sc.nextFloat();
		System.out.printf("Maximum Number in %f,%f,%f is %f:", value1, value2, value3,
				maximumfloat.maxFloat(value1, value2, value3));
	}
}
