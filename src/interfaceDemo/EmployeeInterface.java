package interfaceDemo;

import java.util.Scanner;

public class EmployeeInterface implements EmpPersonalDetails, EmpQualDetails {
Scanner s = new Scanner(System.in);
int empid;
String name;
	@Override
	public void enterQualDetails() {
		
	}

	@Override
	public void displayQualDetails() {
		
		
	}

	@Override
	public void enterDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter emp id:");
		empid = s.nextInt();
		System.out.println("Enter emp name;");
		name = s.next();
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("emp id:"+empid);
		System.out.println("Name is:"+name);
	}
public static void main(String [] a)
{
	EmployeeInterface obj = new EmployeeInterface();
	obj.enterDetails();
	obj.displayDetails();
	EmpPersonalDetails.salaryDetails();
}
}
