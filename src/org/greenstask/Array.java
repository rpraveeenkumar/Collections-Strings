package org.greenstask;

import java.util.ArrayList;
import java.util.List;

public class Array {
	
	private void Ex1() {
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int len = a.length;
		int sum = 0;
		for (int i : a) {
			sum=sum+i;
			System.out.println(i);
		}
		System.out.println("sum "+sum);
		System.out.println("length "+len); 	
		int avg=(sum/len);
		System.out.println(avg);
	}
	
	private void Ex2() {
		List<Integer> lis=new ArrayList<Integer>();
		lis.add(10);
		lis.add(20);
		lis.add(30);
		lis.add(90);
		lis.add(10);
		lis.add(10);
		lis.set(0, 100);
		lis.set(4, 100);
		lis.set(5, 100);
		for (Integer integer : lis) {
			System.out.println(integer);
		}
		System.out.println(lis);
	}
	
	public static void main(String[] args) {
		Array ar=new Array();
		ar.Ex1();
		ar.Ex2();
	}

}
