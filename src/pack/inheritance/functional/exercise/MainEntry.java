package pack.inheritance.functional.exercise;

import java.util.Scanner;

public class MainEntry {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		maths();
	}
	
	public static void maths() {
		switch (getInput("Please enter math operation: + - * /")) {
		case "+":
			ICalc add = values -> {
				double sum = 0;
				for(int toAdd : values) {
					sum += toAdd;
				}
				return sum;		
			};
			System.out.println(add.compute(getValues(4)));
		break;
		case "-":
			ICalc sub = values -> {
				double sum = 0;
				for(int toSub : values) {
					sum -= toSub;
				}
				return sum;		
			};
			System.out.println(sub.compute(getValues(4)));
		break;
		case "*":
			ICalc multi = values -> {
				double mult = 0;
				for(int i = 0; i < values.length; i++) {
					if(i == 0) {
						mult = values[i];
					} else {
						mult = mult*values[i];
					}
				}
				return mult;		
			};
			System.out.println(multi.compute(getValues(4)));
		break;
		case "/":
			ICalc divide = values -> {
				double div = 0;
				for(int i = 0; i < values.length; i++) {
					if(i == 0) {
						div =  values[i];
					} else {
						div = div/values[i];
					}
				}
				return div;		
			};
			System.out.println(divide.compute(getValues(2)));
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
	
	public static int[] getValues(int limit) {
		System.out.println("Please enter "+limit+" values...");
		int[] values = new int[limit];
		for(int i = 0; i < limit; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

}
