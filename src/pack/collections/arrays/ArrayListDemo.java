package pack.collections.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove((int)0);
		list.remove(list.get(0));
		System.out.println(list);
		Collections.sort(list);
	}

}
