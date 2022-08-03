package org.array;

import java.util.ArrayList;
import java.util.List;

public class Retainmethod {

	private void retianmeth() {
		List<Integer> ad=new ArrayList<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		List<Integer> ad2=new ArrayList<Integer>();
		ad2.addAll(ad);
		ad2.add(60);
		ad2.add(70);
		ad2.add(80);
		System.out.println(ad);
		System.out.println(ad2);
		ad2.retainAll(ad);
		System.out.println(ad2);

	}
	
	
	public static void main(String[] args) {
		Retainmethod rm=new Retainmethod();
		rm.retianmeth();
	}
}
