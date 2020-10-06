package abstractionPrograms;

public class Deer_Demo extends Abstract_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer_Demo dd = new Deer_Demo();
		dd.eat();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Deers eat grass.");
		drink();
	}

}
