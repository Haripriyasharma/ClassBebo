package abstractionPrograms;

import java.util.Scanner;

public abstract class Employee {
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	Scanner s = new Scanner(System.in);
	public void input_details()
	{
		System.out.println("Enter empid:");
		empId = s.nextInt();
		System.out.println("Enter emp name:");
		empName = s.next();
		
	}

	public abstract void calculate_balance_leaves();

	public abstract int avail_leave(int no_of_leaves,char type_of_leave);

	public abstract void calculate_salary();

}
