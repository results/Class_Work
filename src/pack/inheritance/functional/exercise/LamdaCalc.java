package pack.inheritance.functional.exercise;

import java.util.Scanner;

public class LamdaCalc {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		maths();
	}
	
	public static void maths() {
		switch (getInput("Please enter math operation: + - * /")) {
		case "+":
			ICalcGeneric<Integer> add = (Integer x, Integer y) -> x+y;
			System.out.println("Answer: "+add.compute(getValues(),getValues()));
		break;
		case "-":
			ICalcGeneric<Integer> sub = (Integer x, Integer y) -> x-y;
			System.out.println("Answer: "+sub.compute(getValues(),getValues()));
		break;
		case "*":
			ICalcGeneric<Float> mul = (Float x, Float y) -> x*y;
			System.out.println("Answer: "+mul.compute((float)getValues(),(float)getValues()));
		break;
		case "/":
			ICalcGeneric<Float> div = (Float x, Float y) -> x/y;
			System.out.println("Answer: "+div.compute((float)getValues(),(float)getValues()));
		break;
		default:
			System.out.println("Not a correct math operation. Try again.");
			maths();
		break;	
		}
		scanner.close();
	}
		
	public static String getInput(String message) {
		System.out.println(message);
		return scanner.nextLine();
	}
	
	public static int getValues() {
		System.out.println("Please enter a value: ");
		return scanner.nextInt();
	}

}
