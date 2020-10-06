package Practice;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element:");
			a[i] = s.nextInt();
		}
		/* display matrix */
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting:");
		for(int l=0;l<n;l++)
		{
			System.out.println("\t"+a[l]);
		}
		
	}

}
