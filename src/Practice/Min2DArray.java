package Practice;

import java.util.Scanner;

public class Min2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,c=0, min;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		r = s.nextInt();
		System.out.println("Enter no. of columns:");
		c = s.nextInt();
		int [][]a = new int[r][c];
		System.out.println("Enter elements of the array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.print("Elements of array are:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		min=a[0][0];
		for(int i = 0; i < r; i++)
		{
			for(int j=0;j<c;j++) {
				if(min > a[i][j])
				{
					min = a[i][j];
				}
			}
		}
		System.out.println("Minimum value:"+min);
	}

}
