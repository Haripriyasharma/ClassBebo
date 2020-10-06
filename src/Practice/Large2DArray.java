package Practice;

import java.util.Scanner;

public class Large2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0,c=0, max;
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

		max=a[0][0];
		for(int i = 0; i < r; i++)
		{
			for(int j=0;j<c;j++) {
				if(max < a[i][j])
				{
					max = a[i][j];
				}
			}
		}
		System.out.println("Maximum value:"+max);
	}
}
