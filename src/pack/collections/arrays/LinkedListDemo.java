package pack.collections.arrays;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Dog");
		list.add("mayo");
		list.add("blanket");
		list.add("pepsi");
		list.add("ans");
		System.out.println(list);
		System.out.println("Size: "+list.size());
		list.set(0, "bigger dog");
		list.add(1,"Spicy mayo");
		System.out.println(list);
		System.out.println("Size: "+list.size());
	}

}
