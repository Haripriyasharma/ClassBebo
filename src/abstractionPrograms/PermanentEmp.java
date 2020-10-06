package abstractionPrograms;

import java.util.Scanner;

public class PermanentEmp extends Employee{
	int paid_leaves=12,sick_leave=12,casual_leave=12,leave_balance;
	double basic,hra,pf,total_salary,one_day_sal,deduct;
	static Scanner s = new Scanner(System.in);

	void print_leave_details()
	{
		System.out.println("Total leaves="+paid_leaves+sick_leave+casual_leave);
	}
	void inputSalary()
	{
		System.out.println("Enter basic salary");
		basic = s.nextDouble();
	}
	@Override
	public void calculate_balance_leaves() {
		// TODO Auto-generated method stub


	}

	@Override
	public int avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		no_of_leaves = s.nextInt();
		type_of_leave = s.next().charAt(0);
		if(type_of_leave == 's')
		{
			leave_balance = sick_leave-no_of_leaves;
		}
		else if(type_of_leave == 'c')
		{
			leave_balance = casual_leave-no_of_leaves;
		}
		else if(type_of_leave == 'p')
		{
			leave_balance = paid_leaves-no_of_leaves;
		}
		else
		{
			System.out.println("Sorry! Wrong choice");
		}
		return leave_balance;
	}
	void deduction()
	{
		if (leave_balance<0)
		{
			one_day_sal = total_salary/30;
			deduct = total_salary-one_day_sal;
		}
	}
	@Override
	public void calculate_salary() {
		// TODO Auto-generated method stub
		deduction();
		pf = 12/100*basic;
		hra = 50/100*basic;
		total_salary = basic+hra-pf-deduct;
		
	}
	public static void main(String [] a)
	{
		PermanentEmp permanent = new PermanentEmp();
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			permanent.print_leave_details();
		case 2:
			permanent.inputSalary();
		
		}
	}
}
