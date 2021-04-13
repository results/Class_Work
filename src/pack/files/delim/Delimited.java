package pack.files.delim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Delimited {
	
	static ArrayList<Course> courses = new ArrayList<>();
	
	public static void readFile() throws FileNotFoundException {
			File file = new File(".\\courses.csv");
			Scanner scanner = new Scanner(file);
			System.out.println("Raw input: ");
			while(scanner.hasNextLine()) {
				String input = scanner.nextLine();
				System.out.println(input);
				String[] bits = input.split(",");
				courses.add(new Course(bits[0], bits[1], bits[2]));
			}	
			scanner.close();
	}
	
	public static void display() {
		System.out.println("Formatted Input: ");
		for(Course course : courses) {
			System.out.println(course.toString());
		}
	}

	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		display();
	}

}
