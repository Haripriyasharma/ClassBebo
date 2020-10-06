package Practice;

public class NaturalSum {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum = i+sum;
		}
		System.out.println("Sum of first 100 natural numbers is"+sum);
	}

}
