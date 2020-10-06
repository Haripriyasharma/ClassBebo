package Practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int reversed = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = s.nextInt();
		while(num!=0) {
			int digit = num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		System.out.println("Reversed number is:"+reversed);
	}

}
