package Practice;

import java.util.Scanner;

public class AddUntilZero {

	public static void main(String[] args) {
		int sum = 0;
		int n;
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("Enter number:");
		n = s.nextInt();
		sum = sum+n;
		}
		while(n != 0);
		System.out.println("Sum is:"+sum);
	}	
}
