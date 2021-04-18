package pack.inheritance.functional;

public class StringMain {

	public static void main(String[] args) {
		IConcatString comp = (String a, String b) -> a+b;
		System.out.println(comp.compare("Name is ", "dog"));
	}

}
