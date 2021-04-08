package pack.collections;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInOut {
	
	static class Student {
					
		public Student(String name, int iD, String course, double gPA) {
			this.name = name;
			ID = iD;
			Course = course;
			GPA = gPA;
		}
		
		String name;
		int ID;
		String Course;
		double GPA;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getCourse() {
			return Course;
		}
		public void setCourse(String course) {
			Course = course;
		}
		public double getGPA() {
			return GPA;
		}
		public void setGPA(double gPA) {
			GPA = gPA;
		}		
		
	}
	
	private static String[][] question = new String[][]{{"Student Name: ",""},{"Student ID: ",""},{"Student Course: ",""},{"Student GPA: ",""}};
		
	private static Student createStudent() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < question.length; i++) {
			System.out.println("Please enter "+question[i][0]);
			question[i][1] = scanner.next();
		}
		scanner.close();
		return new Student(question[0][1], Integer.parseInt(question[1][1]), question[2][1], Double.parseDouble(question[3][1]));
	}
	
	private static void writeStudent(Student student) throws IOException {
		Path path = Paths.get(".\\student.txt");
		BufferedWriter writer = null;
		StringBuilder sBuilder = new StringBuilder().append(question[0][0]).append(student.getName()).append("\n");
		sBuilder.append(question[1][0]).append(student.getID()).append("\n");//just to use gets as asked, normally would just print string[][]
		sBuilder.append(question[2][0]).append(student.getCourse()).append("\n");
		sBuilder.append(question[3][0]).append(student.getGPA()).append("\n");
		try {
			writer = Files.newBufferedWriter(path,Charset.forName("UTF-8"));
			writer.write(sBuilder.toString());	
		} finally {
			writer.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		writeStudent(createStudent());
	}

}
