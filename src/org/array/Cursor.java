package org.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor {
	
	//foreach - only forward direction, no removal
	//iterator - only forward direction, can remove
	//list iterator - bi-directional, forward and backward, can read, add, remove, replace
	
	private void foreach() {
		ArrayList ar=new ArrayList();
		ar.add("Praveen");
		ar.add(35);
		ar.add("kumar");
		ar.add(68);
		ar.add("Priya");
		System.out.println("Before "+ar);
		Iterator iter = ar.iterator();  //single directional
		while (iter.hasNext()) {
			if (iter.next().equals(35)) {
				iter.remove();
			}
		}
		System.out.println("Afrer "+ar);
	}
	
	private void listiter() {
		ArrayList ar=new ArrayList();
		ar.add("Praveen");
		ar.add(35);
		ar.add("kumar");
		ar.add(68);
		ar.add("Priya");
		System.out.println("Before "+ar);
		ListIterator liter = ar.listIterator(); //bi-directional
		liter.add("Priyankpraveenkumar");
		while (liter.hasNext()) {
			if (liter.next().equals(68)) {
				liter.set(35);
			}
		}
		
		System.out.println("Afrer "+ar);

	}
	
	public static void main(String[] args) {
		Cursor c=new Cursor();
		c.foreach();
		c.listiter();
	}

}
