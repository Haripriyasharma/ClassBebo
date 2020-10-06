package InheritanceDemo;

public class dog extends Animal {
	String color="red";
	public void displayColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		dog d = new dog();
		d.displayColor();
		
	}

}
