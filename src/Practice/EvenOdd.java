package Practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		 int n;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter a number:");
		 n = s.nextInt();
		 if(n%2==0) {
			 System.out.println("Even number.");
		 }
		 else {
			 System.out.println("Odd number.");
		 }
		 
	}

}
