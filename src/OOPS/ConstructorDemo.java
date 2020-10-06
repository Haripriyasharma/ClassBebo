package OOPS;

public class ConstructorDemo {
	int a,b,sum;
	public ConstructorDemo() 
	{
		a=2;
		b=7;
	}
	public void add()
	{
		sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj = new ConstructorDemo();
		obj.add();
	}

}
