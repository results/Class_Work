package pack;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		//System.err.println(isPrime(2));
		getChineseZodiac();
		drawStars();
	}
	
	/**
	 * Checks if provided value is a prime number
	 * @param value to check	
	 * @return boolean is value prime number
	 */
	public static boolean isPrime(int value) {
		if(value <= 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(value); i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static String getAnimalName(int yr) {
		switch(yr%12) {
			case 0:
				return "Monkey";
			case 1:
				return "Rooster";
			case 2:
				return "Dog";		
			case 3:
				return "Pig";
			case 4:
				return "Rat";
			case 5:
				return "Ox";
			case 6:
				return "Tiger";
			case 7:
				return "Rabbit";
			case 8:
				return "Dragon";
			case 9:
				return "Snake";
			case 10:
				return "Horse";
			case 11:
				return "Sheep";
		}
		return "Invalid year: Must be positive.";
	}
	
	public static void getChineseZodiac() {
		System.out.println("Please enter the year:");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("The animal for "+ year + " is a "+getAnimalName(year));		
		scanner.close();
	}
	
	
	public static void drawStars() {
		int rows = 5;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j <= i; j++) { 
				System.out.print("* ");
			}
			System.out.println();//move to new line?
		}
	}
	
	
	
	

}
