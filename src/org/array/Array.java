package org.array;

public class Array {
	
	public void Array1() {
		int ar[]=new int[5];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("****************************");

	}
	
	public void Array2() {
		int ar[]=new int[5];
		ar[0]=10;
		ar[1]=30;
		ar[2]=30;
		ar[3]=30;
		ar[4]=30;
		ar[0]=30;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("****************************");
		
	}
	
	public void Array3() {
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		num[2]=300;
		for (int i : num) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		Array ar=new Array();
		ar.Array1();
		ar.Array2();
		ar.Array3();
		
	}
}
