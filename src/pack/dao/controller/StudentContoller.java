package pack.dao.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pack.dao.interfaces.IStudent;
import pack.dao.interfaces.SQLConnection;
import pack.dao.model.Student;


public class StudentContoller extends SQLConnection implements IStudent {

	@Override
	public ArrayList<Student> findByState(String state) throws SQLException {
		ArrayList<Student> allStudents = new ArrayList<>();
		PreparedStatement preparedStatement = createStatement(StudentSQL.FIND_BY_STATE.getStatement());
		preparedStatement.setString(1, state);
		ResultSet set = query(preparedStatement);
		while(set.next()) {
			allStudents.add(new Student(set.getInt("id"), set.getString("firstname"), set.getString("lastname"),set.getString("street")));
		}
		set.close();
		preparedStatement.close();
		return allStudents;
	}

	public ArrayList<Student> getAllStudents() throws SQLException {
		ArrayList<Student> allStudents = new ArrayList<>();
		ResultSet set = query(StudentSQL.FIND_ALL.getStatement());
		while(set.next()) {
			allStudents.add(new Student(set.getInt("id"), set.getString("firstname"), set.getString("lastname"),set.getString("street")));
		}
		set.close();
		return allStudents;
	}

	@Override
	public boolean updateAddress(Student student, String newAddress) throws SQLException {
		PreparedStatement preparedStatement = createStatement(StudentSQL.UPDATE_ADDRESS.getStatement());
		preparedStatement.setInt(2, student.getId());
		preparedStatement.setString(1, newAddress);
		int set = update(preparedStatement);	
		preparedStatement.close();
		return (set >= 1 ? true : false);//1+ rows effected returns true
	}

	@Override
	public boolean insertStudent(Student student) throws SQLException {
		PreparedStatement preparedStatement = createStatement(StudentSQL.INSERT_NEW.getStatement());
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getFirstname());
		preparedStatement.setString(3, student.getLastname());
		preparedStatement.setString(4, student.getStreet());
		int set = update(preparedStatement);//insert is just an update afaik	
		preparedStatement.close();
		return (set >= 1 ? true : false);//1+ rows effected returns true
	}

	@Override
	public Student findByID(int ID) throws SQLException {
		Student student = null;
		PreparedStatement preparedStatement = createStatement(StudentSQL.FIND_BY_ID.getStatement());
		preparedStatement.setInt(1, ID);
		ResultSet set = query(preparedStatement);
		while(set.next()) {
			student = new Student(set.getInt("id"), set.getString("firstname"), set.getString("lastname"),set.getString("street"));
		}
		set.close();
		preparedStatement.close();
		return student;
	}

}
