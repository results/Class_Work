package pack;

import java.util.Scanner;

/**
 * Core Java - Exercise - Control Flow (Conditional) Statements
 * @author John Fink
 *
 */
public class CoreControlFlow {

	public static void main(String[] args) {
		one();
		two();
		three();
		four();
		//five(); //Should declare scanner outside of method to work correctly with both
		six();

	}
	
	/**
	 * 1.
	 * Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to print out “Less than 10” if x is less than 10. 
	 * Change x to equal 15 and notice the result (console should not display anything).
	 */
	
	private static void one() {
		System.out.print("Question 1: ");
		int x = 7;
		if(x < 10)
			x = 15;
		System.out.println(x);//Whys it say dont print it but says notice the result...?
	}
	
	/**
	 * 2.
	 * Write a program that declares 1 integer variable x, and then assigns 7 to it. 
	 * Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” if x is greater than 10. 
	 * Change x to 15 and notice the result.
	 */
	private static void two() {
		System.out.print("Question 2: ");
		int x = 7;
		if(x < 10) {
			System.out.println("Less Than 10");
		} else {
			System.out.println("Greater Than 10");
		}		
	}
	
	/**
	 * 3.
	 * Write a program that declares 1 integer variable x, and then assigns 15 to it. 
	 * Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10, “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20”
	 * if x is greater than or equal to 20. Change x to 50 and notice the result.
	 */
	
	private static void three() {
		System.out.print("Question 3: ");
		int x = 15;
		if(x < 10) {
			System.out.println("Less Than 10");
		} else if(x >= 10 && x < 20) {
			System.out.println("Between 10 and 20 ");
		} else {
			System.out.println("greater than or equal to 20");
		}
	}
	
	/**
	 * 4.
	 * Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints 
	 * “In range” if between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
	 */
	private static void four() {
		System.out.print("Question 4: ");
		int x = 15;
		if(x < 10 || x > 20) {
			System.out.println("Out of range");
		} else if(x >= 10 && x <= 20) {
			System.out.println("In range");
		}
	}
	
	/**
	 * 5.
	 * Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
		A: 90-100
		B: 80-89
		C: 70-79
		D: 60-69
		F: <60
		Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range.” if the score is less than 0 or greater than 100.
	 */
	private static void five() {
		System.out.println("Question 5: Enter Score...");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.print("Question 5: Score is - ");
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D");
		} else if(score >= 0 && score < 60) {
			System.out.println("F");
		} else {
			System.out.println("Score out of range.");
		}
		scanner.close();
	}
	
	/**
	 * 6.
	 * Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday. 
	 * Print “Out of range” if the number is less than 1 or greater than 7. Don’t forget to include “break” statements in each of your cases.
	 */
	private static void six() {
		System.out.println("Question 6: Enter day(int)...");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		System.out.print("Question 6: Day is - ");
		switch(day) {
		case 1:
			System.out.print("Monday");
		break;
		case 2:
			System.out.print("Tuesday");
		break;
		case 3:
			System.out.print("Wednesday");
		break;
		case 4:
			System.out.print("Thursday");
		break;
		case 5:
			System.out.print("Friday");
		break;
		case 6:
			System.out.print("Saturday");
		break;
		case 7:
			System.out.print("Sunday");
		break;
		default:
			System.out.println("Out of range.");
		break;
		}
		scanner.close();
	}
	
}
