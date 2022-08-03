package org.StringPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int a,i=0,j=0;
		int num = 985632;
		a=num;
		while (a>0){
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
		System.out.println(j);
		}
}
