package pack.inheritance.functional;

public class FunctionalMain {

	public static void main(String[] args) {
		FunctionalDemo functionalDemo = new FunctionalDemo();
		functionalDemo.say();
		IFunctionalDemo iDemo = () -> {String message = "yahoooo";
			System.out.println(message);
		};
	}

}
