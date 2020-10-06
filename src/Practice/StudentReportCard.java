package Practice;

import java.util.Scanner;

public class StudentReportCard {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of students:");
		n = s.nextInt();
		/* input roll no.s*/
		int []roll = new int[n];
		System.out.println("Enter "+n+" roll no.s of students");
		for(int i=0;i<n;i++)
		{
			roll[i]=s.nextInt();
		}
		
		/* input names */
		String []name = new String[n];
		System.out.println("Enter "+n+" names of students");
		for(int i=0;i<n;i++)
		{
			name[i]=s.next();
		}
		/* input English marks */
		int []e_marks = new int[n];
		System.out.println("Enter marks in English:");
		for(int i=0;i<n;i++)
		{
			e_marks[i]=s.nextInt();
		}
		/* input Hindi marks */
		int []h_marks = new int[n];
		System.out.println("Enter marks in Hindi:");
		for(int i=0;i<n;i++)
		{
			h_marks[i]=s.nextInt();
		}
		/* input Math marks */
		int []m_marks = new int[n];
		System.out.println("Enter marks in Math:");
		for(int i=0;i<n;i++)
		{
			m_marks[i]=s.nextInt();
		}
		/* total marks*/
		int total[] = new int[n];
		for(int i=0;i<n;i++)
		{
			total[i] = e_marks[i]+m_marks[i]+h_marks[i];
			// Display Result
			System.out.println("Total marks of "+(i+1)+" student "+total[i]);
		}

		/*calculate average*/
		float avg[] = new float[n];
		for(int i=0; i<n; i++)
		{
			avg[i] = total[i]/n;
			/*Display results*/
			System.out.println("Average of "+(i+1)+" student"+avg[i]);
			if(avg[i]>=85)
			{
				System.out.println("Grade A");
			}
			else if(avg[i]>=75 && avg[i]<85)
			{
				System.out.println("Grade B");
			}
			else if(avg[i]>=65 && avg[i]<75)
			{
				System.out.println("Grade C");
			}
			else
			{
				System.out.println("Grade D");
			}	
		}
	}
}
