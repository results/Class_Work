package pack.generics;

public class GenericMain {

	public static void main(String[] args) {
		GenericDemo<String> genericDemo = new GenericDemo<String>("Booo");
		GenericDemo<Integer> genericDemoInt = new GenericDemo<Integer>(1);
		
		GenericMulti<String, Integer> multi = new GenericMulti<String, Integer>("Per Scholas", 11025);
		
		
	}

}
