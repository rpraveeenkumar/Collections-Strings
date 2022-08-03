package org.collections;


import java.util.ArrayList;
import java.util.List;

public class List_collection {
	
	//Three types of List
	//1.ArrayList 
	//2.LinkedArrayList
	//3.VectorList
	
	public void List1() {
		List<String> ls = new ArrayList<String>();
		ls.add("how");
		ls.add("how");
		ls.add("&");
		ls.add("85");
		ls.add("Y");
		ls.add("are");
		ls.add("you");
		ls.set(3, "you");
		System.out.println(ls);
		
		for (Object eachobj : ls) {
			System.out.println(eachobj);
		}
	}
	
	public static void main(String[] args) {
		List_collection lc=new List_collection();
		lc.List1();
	}

}
