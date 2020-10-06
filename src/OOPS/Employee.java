package OOPS;

import java.util.Scanner;

public class Employee {
	String empId;
	String name;
	Float salary;
	Scanner s = new Scanner(System.in);
	public void enterDetails() {
		System.out.println("Enter emp id:");
		empId = s.next();
		System.out.println("Enter name:");
		name = s.next();
		System.out.println("Enter salary:");
		salary = s.nextFloat();
	}
	public void showDetails() {
		System.out.println("Employee id is:"+empId);
		System.out.println("Employee name is:"+name);
		System.out.println("Employee's salary is:"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.enterDetails();
		emp.showDetails();
	}

}
