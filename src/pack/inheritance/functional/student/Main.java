package pack.inheritance.functional.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	
	static ArrayList<Student> studentList = new ArrayList<>();

	public static void main(String[] args) {
		studentList.add(new Student("Tom", 11, "Economics", 78.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("John", 15, "Economics", 77.5));
		studentList.add(new Student("Alex", 16, "Mathematics", 89.4));
		studentList.add(new Student("James", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 73.5));
		studentList.add(new Student("Adam", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));
		max();
	}
	
	public static void toList() {
		List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(top3Students);
	}
	
	public static void join() {
		String namesJoined = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));
		System.out.println(namesJoined);
	}
	
	public static void group() {
		Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
		System.out.println(studentsGroupedBySubject);
	}
	
	public static void map() {
		Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(namePercentageMap);
	}
	
	public static void max() {
		Optional<Student> sop = studentList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentage)));//returns optional student
		System.out.println(sop.get().getPercentage());//should check obj.ispresent tho
		
		
		//or haseeb
		 Optional<Double> highPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
		 System.out.println(highPercentage);
	}

}
