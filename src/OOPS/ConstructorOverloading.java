package OOPS;

public class ConstructorOverloading {
	public ConstructorOverloading(int a,int b)
	{
		int res = a+b;
		System.out.println(res);
	}
	public ConstructorOverloading(float a,float b) 
	{
		float res = a+b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj = new ConstructorOverloading(12,34);
		ConstructorOverloading obj1 = new ConstructorOverloading(23.56f,45.567f);
	}

}
