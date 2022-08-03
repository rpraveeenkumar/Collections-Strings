package org.string;

public class ReplaceVowals {
	
	public static void main(String[] args) {
		
		String s="This is praveen kumar";
		char vowals[] = {'a','e','i','o','u','A','E','I','O','U'};
		char replace = '@';
		int length = s.length();
		for (int i = 0; i < length; i++) {
			for (int k = 0; k < vowals.length; k++) {
				if (s.charAt(i)==vowals[k]) {
					s=s.replace(s.charAt(i), replace);
			}
			}
		}
		System.out.println(s);
	}

}
