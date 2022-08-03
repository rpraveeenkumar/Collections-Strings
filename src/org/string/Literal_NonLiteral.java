package org.string;

public class Literal_NonLiteral {
	
	public static void main(String[] args) {
		
		String s1 = "Praveen";
		String s2 = "Praveen"; 
		
		//literal string(same value so its share the memory)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String string = s1.concat(s2);
		System.out.println(string);
		System.out.println(System.identityHashCode(string));
		System.out.println("**************************");
		
		String x1= new String("Praveen");
		String x2= new String("Praveen");
		
		// non literal string(its won't share, create new memory)
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		String concat = x1.concat(x2); 
		System.out.println(concat); 
		System.out.println(System.identityHashCode(concat));
		
		
		System.out.println("**************************");
		
		StringBuffer y1= new StringBuffer("Praveen");
		StringBuffer y2= new StringBuffer("Praveen");
		System.out.println("\n"+"Immutable String");
		System.out.println(System.identityHashCode(y1));
		System.out.println(System.identityHashCode(y2));
		StringBuffer con = y1.append(y2);
		System.out.println("\n"+con);
		System.out.println(System.identityHashCode(con));
		
	}
	

}
