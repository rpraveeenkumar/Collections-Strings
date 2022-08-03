package org.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_collection {
	
	//set will not allow duplicates.
	//printing order only change in its 3 types
	
	//3 types of Set
	//HashSet - while print will not follow ascii (alphabetic) or insertion order
	//TreeSet - while print will follow ascii (alphabetic) order
	//LikedHashSet - while print will follow insertion order
	
	//we can't use get method in set, bez it will not follow insertion order and remove duplicates.
//		By converting set in to list we can use the get method. check SetTOList method no.4	
	
	
	public void HashSet() {
		Set<String> set = new HashSet<String>();
		set.add("Praveen");
		set.add("kumar");
		set.add("Priya");
		set.add("Praveen");
		set.add("Priya");
		set.add("Dinesh");
		set.add("Revathi");
		System.out.println("Hast Set");
		System.out.println("not follow ascii (alphabetic) or insertion order");
		System.out.println("***************");
		for (String name : set) {
			System.out.println(name);
		}
		System.out.println();
	}
	
	public void TreeSet() {
		Set<String> set = new TreeSet<String>();
		set.add("Praveen");
		set.add("kumar");
		set.add("Priya");
		set.add("Praveen");
		set.add("Priya");
		set.add("Dinesh");
		set.add("Revathi");
		System.out.println("Tree Set");
		System.out.println("follow ascii (alphabetic) order");
		System.out.println("***************");
		for (String name : set) {
			System.out.println(name);
		}
		System.out.println();
	}
	
	public void LinkedHashSet() {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Praveen");
		set.add("kumar");
		set.add("Priya");
		set.add("Praveen");
		set.add("Priya");
		set.add("Dinesh");
		set.add("Revathi");
		System.out.println("LinkedHashSet");
		System.out.println("follow insertion order");
		System.out.println("***************");
		for (String name : set) {
			System.out.println(name);
		}
		System.out.println();
	}
	
	public void SetToList() {
		Set<String> set = new HashSet<String>();
		set.add("Praveen");
		set.add("kumar");
		set.add("Priya");
		set.add("Praveen");
		set.add("Priya");
		set.add("Dinesh");
		set.add("Revathi");
		System.out.println("Set to List, for using get method");
		System.out.println("***************");
		
		List<String> list=new ArrayList<String>(set);
		System.out.println("Set converted to List");
		for (String str : list) {
			System.out.println(str);
		}
		String li0 = list.get(0);
		String li1 = list.get(1);
		String li2 = list.get(2);
		String li3 = list.get(3);
		String li4 = list.get(4);
		System.out.println("0th index value is "+li0);
		System.out.println("1st index value is "+li1);
		System.out.println("2nd index value is "+li2);
		System.out.println("3rd index value is "+li3);
		System.out.println("4th index value is "+li4);
		System.out.println();

	}
	
	public static void main(String[] args) {
		Set_collection sc=new Set_collection();
		sc.HashSet();
		sc.TreeSet();
		sc.LinkedHashSet();
		sc.SetToList();
	}
}
