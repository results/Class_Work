package pack.inheritance.functional;

import java.util.ArrayList;

public class LampdaList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Dog");
		list.add("rain");
		list.add("water");
		list.add("window");
		list.add("coffee");
		list.add("micrphone");
		list.forEach(string -> System.out.println(string));
		list.forEach(System.out::println);
	}

}
