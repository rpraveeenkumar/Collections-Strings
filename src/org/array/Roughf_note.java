package org.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Roughf_note {
	
	public void Arraynote() {

		int ar[]=new int[5];
		ar[0]=10;
		ar[1]=60;
		ar[2]=20;
		ar[3]=40;
		ar[4]=30;
		for (int i : ar) {
			System.out.println(i);
		}
		List<int[]> asList = Arrays.asList(ar);
		for (int j : ar) {
			System.out.println(j+" *");
		}
		
		System.out.println("**********************");
	}
	
	private void compare() {
		int a[]= {10,20,30,40};
		int b[]= {10,20,30,4};
		
		if (a==b) {
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		
		System.out.println("next method");
		
		if (Arrays.equals(a, b)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		System.out.println("**********************");
	}
	
	private void sort() {
		int ar[] = {35,86,-35,753,-553,35,8461,-7};
		System.out.println("befor sort");
		for (int i : ar) {
			System.out.print(i+" ");
		}
		Arrays.sort(ar);
		System.out.println("after sort");
		for (int i : ar) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("**********************");
	}
	
	public static void main(String[] args) {
		Roughf_note rfn = new Roughf_note();
		rfn.Arraynote();
		rfn.compare();
		rfn.sort();
	}

}
