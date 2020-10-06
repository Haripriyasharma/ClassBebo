package OOPS;

public class DefaultDataTypes {
	int i;
	float f;
	char c;
	Byte b;
	Long l;
	Double d;
	String s;
	short sh;
	Boolean bool;
	public void displayValues() {
		System.out.println("Value of int:"+i);
		System.out.println("Value of float:"+f);
		System.out.println("Value of char:"+c);
		System.out.println("Value of byte:"+b);
		System.out.println("Value of long:"+l);
		System.out.println("Value of double:"+d);
		System.out.println("Value of string:"+s);
		System.out.println("Value of boolean:"+b);
		System.out.println("value of short:"+sh);
	}
	public static void main(String[] args) {
		DefaultDataTypes obj = new DefaultDataTypes();
		obj.displayValues();

	}

}
