package Practice;

import java.util.Scanner;

public class Authnticate {

	public static void main(String[] args) {
		String username, password;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username:");
		username = s.nextLine();
		System.out.println("Enter password:");
		password = s.nextLine();
		if(username.equals("admin") && password.equals("admin")) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}

	}

}
