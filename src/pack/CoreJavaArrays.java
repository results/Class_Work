package pack;

import java.util.Arrays;

/**
 * Core Java - Exercise - Arrays
 * @author John Fink
 *
 */
public class CoreJavaArrays {
	
	public static void main(String[] args) {
		one();
		two();
		three();
		//four();//Throws out of bounds by design so will comment out for other methods to run
		five();
		six();
		seven();
		eight();
		nine();
		ten();
	}
	/**
	 * Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	private static void one() {
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		System.out.print("Question 1: ");
		for(int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	/**
	 * Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
	 */
	private static void two() {
		System.out.print("Question 2: ");
		int[] array = {13, 5, 7, 68, 2};	
		System.out.println(array[array.length/2]);
	}
	
	/**
	 * Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
	 *  Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
	 */
	private static void three() {
		System.out.print("Question 3: ");
		String[] array = {"red","green","blue","yellow"};
		System.out.print("Length: "+array.length+" ");
		String[] arrayTwo = array.clone();
		System.out.println("Cloned: "+Arrays.toString(arrayTwo));
	}
	
	/**
	 * Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. 
	 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
	 *   Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
	 */
	private static void four() {
		System.out.print("Question 4: ");
		int[] array = {13, 5, 7, 68, 2};	
		System.out.print("First: "+array[0]+" Last: "+array[array.length-1]+" ");
		System.out.print("Out of Bounds Test: "+array[array.length]+" ");
		array[5] = 5;//same out of bounds
		System.out.println();
		
	}
	
	/**
	 * Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
	 */
	private static void five() {
		System.out.print("Question 5: ");
		int[] array = new int[5];
		for(int i = 0; i < array.length; i ++) {
			array[i] = i; 
			System.out.print("array["+i+"] = "+i+" ");
		}
		System.out.println();
	}
	
	/**
	 * Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
	 */
	private static void six() {
		System.out.print("Question 6: ");
		int[] array = new int[5];
		for(int i = 0; i < array.length; i ++) {
			int val = i*2;
			array[i] = val; 
			System.out.print("array["+i+"] = "+val+" ");
		}
		System.out.println();
	}
	
	/**
	 * Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
	 */
	private static void seven() {
		System.out.print("Question 7: ");
		int[] array = {13, 5, 7, 68, 2};	
		for(int i = 0; i < array.length; i ++) {
			if(i == (array.length/2))
				continue;
			System.out.print("array["+i+"] = "+array[i]+" ");
		}
		System.out.println();		
	}
	
	/**
	 * Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
	 */
	private static void eight() {
		System.out.print("Question 8: ");
		String[] array = {"red","green","blue","yellow","purple"};
		String temp = "";//hold first string
		for(int i = 0; i < array.length; i ++) {
			if(i == 0) {
				temp = array[i];
				array[i] = array[array.length/2];
			} else if(i == (array.length/2)) {
				array[i] = temp;
			}
			System.out.print("array["+i+"] = "+array[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array.
	 *  The output will look like the following:
			Array in ascending order: 0, 1, 2, 4, 9, 13
			The smallest number is 0
			The biggest number is 13
	 */
	private static void nine() {
		System.out.print("Question 9: ");
		int[] array = {4, 2, 9, 13, 1, 0};	
		int temp = 0;
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array.length; j ++) {
				if((j+1 < array.length) &&(array[j] > array[j+1])) {//check to make sure not out of bounds
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted: "+Arrays.toString(array)+" Min: "+array[0]+" Max: "+array[array.length-1]+" ");	
	}
	
	/**
	 * Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	 */
	private static void ten() {
		Object[] array = {3,"These","Arrays","Works",3.5};
		System.out.println("Question 10: "+Arrays.toString(array)+".");	
	}	
	
}
