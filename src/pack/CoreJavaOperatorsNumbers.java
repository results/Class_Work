package pack;

/**
 * Core Java - Exercise - Operators and Numbers
 * @author John
 *
 */
public class CoreJavaOperatorsNumbers {

	public static void main(String[] args) {
		questionThree();
		questionFour();
		questionFive();
		questionSix();
		questionSeven();
		questionEight();
	}
	
	/**
	 * 1.
	 * Write the following integers in binary notation. 
	 * Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. 
	 * However, you may check your answers using Java methods.
		1 - 0001	
		8 - 1000
		33 - 100001
		78 - 1001110
		787 - 1100010011
		33,987 - 1000010011000011
	 */
	
	/** 2.
	 * Convert the following binary numbers to decimal notation. 
	 * Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. 
	 * However, you may check your answers using Java methods.
		0010 -	2
		1001	-	9
		00110100	- 52	
		01110010	-	114
		001000011111	-	543
		0010110001100111	-	11367
	 * 
	 */
	
	
	/**
	 * 3.
	 * Write a program that declares an integer a variable x and assigns the value 2 to it and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
	 * Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. 
	 * Now, print out x in decimal form and in binary notation.
		Do the preceding exercise with the following values:
			
	 * Predicted Answer: BitShift will shift 1 bit over, essentially double the val
	 * 9 - 18
	 * 17 - 34
	 * 88 - 176
	 * 
	 */
	private static void questionThree() {
		int x = 2;
		System.out.print("Question 3: Decimal: "+x+", Binary String: "+Integer.toBinaryString(x)+" -- ");
		x = x << 1;
		System.out.println("SHFITED - Decimal: "+x+", Binary String: "+Integer.toBinaryString(x));
	}
	
	
	/**
	 * 4.
	 * Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. 
	 * Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
		Do the preceding exercise with the following values:
			
		225 ~56
		1555 - ~388			>> 2 is the same as 1/4. >>1 would be half
		32456 - 8114
	 */
	private static void questionFour() {
		int x = 150;
		System.out.print("Question 4: Decimal: "+x+", Binary String: "+Integer.toBinaryString(x)+", -- ");
		x = x >> 2;
		System.out.println("SHFITED - Decimal: "+x+", Binary String: "+Integer.toBinaryString(x));
	}
	
	/**
	 * 5.
	 * Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
	 *  Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. As before, write a comment that indicates what you predict the values to be before printing them out.
	 */
	private static void questionFive() {
		int x = 7, y = 17, z = 0;
		z = x & y;
		System.out.print("Question 5: Bitwise &: "+z+", ");
		z = x | y;
		System.out.println("Bitwise | "+z);
		
	}
	
	/**
	 * 6.
	 * Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. Print the value before and after the increment operator.
	 */
	
	private static void questionSix() {
		int val = 0;
		System.out.println("Question 6 pre: "+val);
		val++;
		System.out.println("Question 6 post: "+val);		
	}
	
	/**
	 * 7.
	 * Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
	 */
	private static void questionSeven() {
		int val = 0;
		System.out.println("Question 7 start val: "+val);	
		++val;
		System.out.println("Question 7 part 1: "+val);		
		val++;
		System.out.println("Question 7 part 2: "+val);	
		val += 1;
		System.out.println("Question 7 part 3: "+val);	
	}
	
	
	/**
	 * 8.
	 * Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y and print the result.
	 *  Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. 
	 *  Notice what the value of sum is. The first configuration incremented x and then calculated the sum while the second configuration calculated the sum and then incremented x.
	 */
	private static void questionEight() {
		int x = 5, y = 8, sum = 0;
		sum = ++x + y;
		System.out.println("Question 8 part 1: "+sum);	
		x = 5;//just to reset
		sum = x++ + y;
		System.out.println("Question 8 part 2: "+sum);	
	}

}
