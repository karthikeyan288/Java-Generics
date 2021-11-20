package com.Generics;

import java.util.Scanner;

public class GenericsMain {
		public static int Integer1;
		public static int Integer2;
		public static int Integer3;

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Generics maximumInteger = new Generics();
			System.out.println("Enter first Number:");
			Integer1 = sc.nextInt();
			System.out.println("Enter second Number:");
			Integer2 = sc.nextInt();
			System.out.println("Enter third Number:");
			Integer3 = sc.nextInt();
			System.out.printf("maximum Number in %d,%d,%d is %d:", Integer1,Integer2,Integer3,maximumInteger.maxNum(Integer1, Integer2, Integer3));	
		}
	}


