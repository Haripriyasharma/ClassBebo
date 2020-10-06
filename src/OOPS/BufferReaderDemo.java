package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	
	Float f;
	Double d;
	char c;
	long l;
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader r = new BufferedReader(in);
	
	/*
	 * public void inputFloat() throws NumberFormatException, IOException {
	 * System.out.println("Enter float value:"); f =Float.valueOf(r.readLine());
	 * System.out.println(f); } public void inputDouble() throws
	 * NumberFormatException, IOException {
	 * System.out.println("Enter double value:"); d =Double.valueOf(r.readLine());
	 * System.out.println(d); } public void inputChar() throws
	 * NumberFormatException, IOException { System.out.println("Enter char value:");
	 * c = (char) r.read(); System.out.println(c); }
	 */
	public void inputLong() throws NumberFormatException, IOException 
	{
		System.out.println("Enter long value:");
		l = r.read();
		System.out.println(l);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferReaderDemo obj = new BufferReaderDemo();
		/*
		 * obj.inputFloat(); obj.inputDouble(); obj.inputChar();
		 */
		obj.inputLong();
		

	}

}
