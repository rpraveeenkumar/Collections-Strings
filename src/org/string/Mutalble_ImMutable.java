package org.string;

public class Mutalble_ImMutable {
	
	public static void main(String[] args) {
		
		String s1 = "Praveen";
		String s2 = "Praveen";
		
		
		
		System.out.println("Immutable String");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String con = s1.concat(s2);
		System.out.println("\n"+con);
		System.out.println(System.identityHashCode(con));
		
		
		StringBuffer x1= new StringBuffer("Praveen");
		StringBuffer x2= new StringBuffer("Praveen");
		System.out.println("\n"+"Immutable String");
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		StringBuffer concat = x1.append(x2);
		System.out.println("\n"+concat);
		System.out.println(System.identityHashCode(concat));
		
	
	}

}
