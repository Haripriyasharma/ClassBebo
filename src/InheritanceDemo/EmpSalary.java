package InheritanceDemo;

public class EmpSalary extends EmpDemo{
	int salary;
	public void acc()
	{
		acceptDetails();
		display();
		System.out.println("Enter salary: ");
		salary = s.nextInt();
		System.out.println("Salary is: "+salary);
	}
	public static void main(String[] args) {
		
		EmpSalary oo = new EmpSalary();
		oo.acc();
	}

}
