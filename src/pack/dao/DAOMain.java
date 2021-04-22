package pack.dao;

import java.sql.SQLException;

import pack.dao.controller.StudentContoller;
import pack.dao.model.Student;


public class DAOMain {

	public static void main(String[] args) throws SQLException {
		StudentContoller studentContoller = new StudentContoller();
		System.out.println("Find ALL Students: ");
		studentContoller.getAllStudents().forEach(System.out::println);
		System.out.println("Updated Address ? : "+studentContoller.updateAddress(studentContoller.getAllStudents().get(499),"Basement"));
		System.out.println("Find PA Students: ");
		studentContoller.findByState("PA").forEach(System.out::println);
		System.out.println("Inserted New Student ? : "+studentContoller.insertStudent(new Student(studentContoller.getAllStudents().size()+1, "Doug", "rra", "lilac lane")));
		System.out.println("Find by ID 470: "+studentContoller.findByID(470));
		studentContoller.disconnect();
	}

}
