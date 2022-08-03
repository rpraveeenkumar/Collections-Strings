package org.string;

public class Login {
	
	public static void main(String[] args) {
		
		String pass = "Java";
		String name = "Priya";
		String password = "java";
		int output = pass.compareTo(password);
		
		if (output == 0) {
			System.out.println("Password correct");
		}
		else {
			System.out.println("Password Incorrect");
		}
	}

}
