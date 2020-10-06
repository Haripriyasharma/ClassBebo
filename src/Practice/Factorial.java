package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n;
		int fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial:");
		n = s.nextInt();
		for(int i=n;i>0;i--) {
			fact = fact*i;
		}
		System.out.println("factorial of "+n+" "+"is"+" "+fact);
	}

}
