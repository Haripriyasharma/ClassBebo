package Practice;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = s.nextInt();
		if(num>0) {
			System.out.println("positive no.");
		}
		else if(num<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("entered no. is 0");
		}

	}

}
