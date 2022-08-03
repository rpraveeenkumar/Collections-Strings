package org.string;

public class Str {
	
	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("hi");
		s.append(5);
		System.out.println(s);
		for (int i = 0; i < 50; i++) {
			s.append(i);
			System.out.println(s);
			System.out.println(System.identityHashCode(s));
		}
		
	}

}
