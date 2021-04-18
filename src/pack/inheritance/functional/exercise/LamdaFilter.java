package pack.inheritance.functional.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaFilter {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi boop");
		list.add("Hi scoop");
		list.add("Hi bluebwerry");
		list.add("We dog");
		list.stream().filter(p -> p.contains("We")).forEach(z -> System.out.println(z));
		
		list.stream().filter(p -> p.contains("We")).forEach(System.out::println);
		list.stream().map(p -> p.toLowerCase()).filter(p -> p.contains("hi")).map(p -> p.toUpperCase()).forEach(System.out::println);
		System.out.println(list.stream().map(p -> p.toLowerCase()).filter(p -> p.contains("hi")).map(p -> p.toUpperCase()).collect(Collectors.joining("|")));

		
		String[] boop = {"we","are","we are","family"};
		Arrays.stream(boop).filter(p -> p.contains("we")).forEach(System.out::println);//use when using non primitives. Primitives like int,long,double will return respective stream e.g. IntStream instead of Stream
		Stream.of(boop).filter(p -> p.contains("we")).forEach(System.out::println);//use with generics. Non promitives e.g String will just call Arrays.stream anyway. Int/Double/Long will need to be flattened to use with respective stream
		
	}

}
