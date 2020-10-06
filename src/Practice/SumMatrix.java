package Practice;

import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
		int r=0,c=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		r = s.nextInt();
		System.out.println("Enter no. of columns:");
		c = s.nextInt();
		/*First matrix*/
		int [][]a = new int[r][c];
		System.out.println("Enter elements of first mtrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		/*Second matrix*/
		int [][]b=new int[r][c];
		System.out.println("Enter elements of second mtrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=s.nextInt();
			}
		}
		/*Sum matrix*/
		int sum [][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		/*Display sum matrix*/
		System.out.println("Sum of both matrices is:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}
		
	}

}
