package org.greenstask;

import java.util.ArrayList;

public class CountDuplicates {

	
	public static ArrayList<Integer> myNumbers(int z) {

	    ArrayList<Integer> digits = new ArrayList<Integer>();
	    String number = String.valueOf(z);
	    for (int a = 0; a < number.length(); a++) {
	        int j = Character.digit(number.charAt(a), 10);
	        digits.add(j);
	    }
	    return digits;

	}
}
