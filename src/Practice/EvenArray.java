package Practice;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number of elements in the array:");
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the elements:");
		for(int i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Odd Numbers:");  
		for(int i=0;i<num;i++){  
			if(arr[i]%2!=0){  
				System.out.println(arr[i]);  
			}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<num;i++){  
			if(arr[i]%2==0){  
				System.out.println(arr[i]);  
			}  
		}
	}
}
