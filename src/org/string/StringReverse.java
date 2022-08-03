package org.string;

public class StringReverse {
	
	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("Hello");
		str.reverse();
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Pagalavan");
		sb.reverse();
		System.out.println(sb);
		
		String s = "Praveen";
		String r = "Praveenkumar";
		int compareTo = s.compareTo(r);
		System.out.println(compareTo);
	}

}
