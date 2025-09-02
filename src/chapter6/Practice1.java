package chapter6;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		System.out.print("User Name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if (!name.equals("strflexx")) {
			System.err.println("Error user name!!!");
		}

		System.out.print("Password: ");
		String password = scanner.nextLine();

		if (password.length() < 6) {
			System.err.println("Password must be over 6 character");
		}
		System.out.println("Login successfully");
		scanner.close();
	}
}
