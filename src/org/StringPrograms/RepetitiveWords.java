package org.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveWords {
	
	public static void main(String[] args) {
		String s="java with core java and with c++ and core java";
		System.out.println(s);
		Map<String, Integer> ms = new HashMap<String, Integer>();
		System.out.println(ms);
		String[] split = s.split(" ");
		for (String word : split) {
			if (ms.containsKey(word)) {
				int i = ms.get(word);
				ms.put(word, i+1);
			}
			else {
				ms.put(word, 1);
			}
		}
		System.out.println(ms);
	}

}
