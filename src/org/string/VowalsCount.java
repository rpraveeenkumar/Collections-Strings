package org.string;

import java.util.Scanner;

public class VowalsCount {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		str.toLowerCase();
		int length = str.length();
		int vowels = 0;
		int consonant = 0;
		
		for (int i = 0; i < length; i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowels++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("Number of vowals in the string is "+vowels);
		System.out.println("Number of consonants  in the string is "+consonant);
	}
}
