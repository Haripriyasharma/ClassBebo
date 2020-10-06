package Practice;

import java.util.Scanner;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
      
        for(int i = 0; i < n; i++)
        {
           for(int j=i+1;j<n;j++) {
        	   if(a[i]==a[j]) {
        		   System.out.println("Duplicate element:"+a[i]);
        	   }
           }
        }
        //System.out.println("duplicate value:"+temp);
	}

}
