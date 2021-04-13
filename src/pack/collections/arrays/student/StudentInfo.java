package pack.collections.arrays.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Retrieve student from file
 * @author John Fink
 *
 */
public class StudentInfo {
	
	private ArrayList<Student> students = new ArrayList<>();  
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	/**
	 * Alternatively could have readfile return a new arraylist, but this means everytime you display you need to reread the file
	 */
	
	public void readFile() throws FileNotFoundException {
			Scanner scanner = new Scanner(new File(".\\students.txt"));
			while(scanner.hasNextLine()) {
				String[] bits = scanner.nextLine().split(" ");//use space as delimiter, not recommended
				this.addStudent(new Student(Integer.parseInt(bits[0]), bits[1], Integer.parseInt(bits[2])));
			}	
			scanner.close();
	}
	
	public void display() {
		System.out.println("All students in list: ");
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}


	
	
}
