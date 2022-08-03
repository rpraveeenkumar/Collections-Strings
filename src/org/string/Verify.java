package org.string;

import java.util.Scanner;

public class Verify {

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your Email Id");
//		String email = sc.nextLine();
//		
//		boolean contains = email.contains("@");
//		System.out.println(contains);
//	}
	
	
//	public static void main(String[] args) {
//		String email = "r.praveenkumar@live.com";
//		System.out.println(email.contains("@"));
//		
//	}
	
	public static void main(String[] args) {
		String s="Welcome to java class java";
		boolean endsWith = s.endsWith("java");
		if (endsWith==true) {
			String replace = s.replace("java", "sql");
			System.out.println(replace);
		}
		else {
			System.out.println("Not ends with java");
		}
		
	}
}
