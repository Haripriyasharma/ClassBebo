package Practice;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		char choice;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter num1:");
		num1 = s.nextInt();
		System.out.println("enter num2:");
		num2 = s.nextInt();
		System.out.println("enter choice:");
		choice = s.next().charAt(0);
		switch(choice)
		{
			case 'a':
			int sum = num1+num2;
			System.out.println("sum is:"+sum);
			break;
			
			case 's':
			int subt = num1-num2;
			System.out.println("Substraction is:"+subt);
			break;
			
			case 'm':
			int mul = num1*num2;
			System.out.println("multiplication is:"+mul);
			break;
			
			case 'd':
			float div = num1*num2;
			System.out.println("division is:"+div);
			break;
			
			default:
			System.out.println("wrong input");
			break;
			
		}
	}
	}


