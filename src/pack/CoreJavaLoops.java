package pack;

/**
 *  Core Java - Exercise - Loops
 * @author John Fink
 *
 */
public class CoreJavaLoops {

	public static void main(String[] args) {
		one();
		two();
		three();
		four();
		five();
		six();
		seven();
		eight();
		nine();
	}
	
	/**
	 * 1.
	 * Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
	 */
	
	private static void one() {
		for(int i = 1; i <=10; i++) {
			System.out.println("Question 1: "+i);
		}
	}
	
	/**
	 * 2.
	 * Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.
	 */
	private static void two() {
		for(int i = 0; i <=100; i += 10) {
			System.out.println("Question 2: "+i);
		}
	}
	
	/**
	 * 3.
	 *  Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
	 */

	private static void three() {
		int i = 1;
		do {
			System.out.println("Question 3: "+i++);
		} while(i <= 10); 		
	}
	
	/**
	 * 4.
	 * Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75. 
	 * Use the “continue” statement to accomplish this.
	 */
	
	private static void four() {
		for(int i = 1; i <=100; i++) {
			if((i % 5 != 0) || i >= 25 && i <= 75)
				continue;
			System.out.println("Question 4: "+i);			
		}
	}
	
	/**
	 * 5.
	 * Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any numbers greater than 50.
	 *  Use the “break” keyword to accomplish this.
	 */
	private static void five() {
		for(int i = 5; i <=100; i += 5) {
			if(i > 50)
				break;
			System.out.println("Question 5: "+i);			
		}
	}
	
	/**
	 * 6.
	 * Write a program that uses nested for-loops to output the following:
		Week 1:
		Day 1
		Day 2
		Day 3
		Day 4
		Day 5
		Week 2:
		Day 1
		Day 2
		Day 3
		Day 4
		Day 5
	 */
	private static void six() {
		System.out.println("Question 6: Start");	
		for(int i = 1; i <=2; i++) {
			System.out.println("Week "+i+": ");
			for(int j = 1; j <=7; j++) {
				System.out.println("Day "+j);	
			}
		}
		System.out.println("Question 6: END");	
	}
	/**
	 * 7.
	 * Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
			11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
	 */
	
	private static void seven() {
		System.out.print("Question 7: ");
		for(int i = 10; i <=200; i++) {
			int val = i;
			int reversed = 0;
		    while(val != 0) {//reverse the val then you can check if its the same
				int remain = val % 10;
				reversed = reversed * 10 + remain;
				val /= 10;
		    }
		    if(reversed == i) {
		    	System.out.print(i+",");
		    }	    	
		}
		System.out.println();
	}
	
	/**
	 * 8.
	 * Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	 */
	private static void eight() {
		System.out.println("Question 8: Start");
		int prev = 0, prevSum = 1, sum = 0;
		for(int i = 0; i <= 50; ++i) {
			sum = prev + prevSum;
			prev = prevSum;
			prevSum = sum;
			System.out.print(sum+" + ");
		}
		System.out.println();
		System.out.println("Question 8: END");
	}
	
	/**
	 * 9.
	 * Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
	 */
	private static void nine() {
		System.out.println("Question 9: Start");	
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);	
			}
		}
		System.out.println("Question 9: END");	
	}
	
	
}
