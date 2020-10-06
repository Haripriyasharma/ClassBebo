package Practice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = s.nextInt();
		for(int i=1;i<=10;i++) {
			int res = num*i;
			System.out.println(num+"*"+i+"="+res);
		}
	}

}
