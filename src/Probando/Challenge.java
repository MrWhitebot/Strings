package Probando;

import java.util.Scanner;

class Challenge {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String input = sc.next();

		if(input.equalsIgnoreCase("admin")){
			System.out.println("Username accepted");
		}
		else{
			System.out.println("Invalid username");
		}
	}
}