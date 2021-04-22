package pack.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import pack.dao.model.Student;


public interface IStudent {
	
	Student findByID(int ID) throws SQLException;
	
	ArrayList<Student> findByState(String state) throws SQLException;
	
	ArrayList<Student> getAllStudents() throws SQLException;
	
	boolean updateAddress(Student student, String newAddress) throws SQLException;
	
	boolean insertStudent(Student student) throws SQLException;

}
