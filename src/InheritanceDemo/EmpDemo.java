package InheritanceDemo;

import java.util.Scanner;

public class EmpDemo {
int empid;
String name;
long contactno;
Scanner s = new Scanner(System.in);

public void acceptDetails() 
{
	System.out.println("Enter emp id: ");
	empid = s.nextInt();
	System.out.println("Enter emp name: ");
	name = s.next();
	System.out.println("Enter emp contact number: ");
	contactno = s.nextLong();
}
public void display()
{
	System.out.println("Emp id is: "+empid);
	System.out.println("Emp name is: "+name);
	System.out.println("Emp contact number is: "+contactno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
