package OOPS;

public class Area {
	
	public void area(double r)
	{
		double c_area = 3.14*r*r;
		System.out.println("Area of circle is:"+c_area);
	}
	public void area(int a)
	{
		int s_area = a*a;
		System.out.println("Area of square is:"+s_area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj = new Area();
		obj.area(64.4);
		obj.area(4);
	}
}
