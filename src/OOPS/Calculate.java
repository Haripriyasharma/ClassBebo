package OOPS;

import java.util.Scanner;

public class Calculate {
	int a,b;
	Scanner s = new Scanner(System.in);
	public void input() {
		System.out.println("Enter a:");
		a = s.nextInt();
		System.out.println("Enter b:");
		b = s.nextInt();
	}
	public void add() {
		System.out.println("Sum of a & b is: "+(a+b));
	}
	public void subract() {
		System.out.println("Substraction is: "+(a-b));
	}
	public void multiply() {
		System.out.println("Multiplication is: "+(a*b));
	}
	public void divide() {
		System.out.println("Division is: "+(a/b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new Calculate();
		c.input();
		c.add();
		c.subract();
		c.multiply();
		c.divide();

	}

}
