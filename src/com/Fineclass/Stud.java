package com.Fineclass;

public class Stud extends Teach{
	
	int c=0;
	
	private void add() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a+b+this.c);
	}
	
	public static void main(String[] args) {
		Stud st=new Stud();
		st.add();
	}

}
