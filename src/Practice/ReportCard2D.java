package Practice;

import java.util.Scanner;

public class ReportCard2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of students:");
		n = s.nextInt();
		/*Input roll no.s*/
		int []roll = new int[n];
		System.out.println("Enter roll no. of"+n+"student");
		for(int i=0;i<n;i++) {
			roll[i] = s.nextInt();
		}

	}

}
