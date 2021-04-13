package pack.collections.arrays;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack = new Stack<>();
		System.out.println(stack);
		stack.push("last in");
		stack.push("first out");
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
	}

}
