package org.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_collection {
	
	public void map1() {
		
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(4, null);
		mp.put(0, "priya");
		mp.put(1, "praveen");
		mp.put(3, "hi");
		mp.put(2, "kumar");
		mp.put(3, null);
		Set<Entry<Integer, String>> es = mp.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry);
		}
		
		System.out.println(mp);
		System.out.println("***********************");
	}
	
	public void map2() {
		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();
		mp.put(4, null);
		mp.put(0, "priya");
		mp.put(1, "praveen");
		mp.put(3, "hi");
		mp.put(2, "kumar");
		
		Set<Entry<Integer, String>> es = mp.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry);
		}
		
		System.out.println(mp);
		System.out.println("***********************");
	}
		
	public void map3() {
		Map<Integer, String> mp = new TreeMap<Integer, String>();
		mp.put(4, null);
		mp.put(0, "priya");
		mp.put(1, "praveen");
		mp.put(3, "hi");
		mp.put(2, "kumar");
		
		Set<Entry<Integer, String>> es = mp.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(mp);
		System.out.println("***********************");
	}
	
	

	public static void main(String[] args) {
		
		Map_collection mc =new Map_collection();
		mc.map1();
		mc.map2();
		mc.map3();
	}
}
