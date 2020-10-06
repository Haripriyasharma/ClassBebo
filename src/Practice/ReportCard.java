package Practice;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		
		int rollno, e_marks, h_marks, m_marks, total;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Roll no.:");
		rollno = s.nextInt();
		
		System.out.println("Enter name:");
		String name = s.nextLine();
		
		System.out.println("Enter marks in english:");
		e_marks = s.nextInt();
		
		System.out.println("Enter marks in hindi:");
		h_marks = s.nextInt();
		
		System.out.println("Enter marks in math:");
		m_marks = s.nextInt();
		
		total = e_marks+h_marks+m_marks;
		System.out.println("Total marks is:"+total);
		
		float avg = total/3;
		if(avg>=85) {
			System.out.println("Grade A");
		}
		else if(avg>=75 && avg<85) {
			System.out.println("Grade B");
		}
		else if(avg>=65 && avg <75) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}

}
