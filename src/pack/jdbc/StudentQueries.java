package pack.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentQueries {
	
	public static ArrayList<Student> findAllStudents() throws SQLException {
		ArrayList<Student> allStudents = new ArrayList<>();
		String prep = "SELECT * FROM STUDENT";
		PreparedStatement preparedStatement = SQLConnection.connection.prepareStatement(prep);
		ResultSet set = preparedStatement.executeQuery();
		while(set.next()) {
			allStudents.add(new Student(set.getInt("id"), set.getString("firstname"), set.getString("lastname"),set.getString("street"), set.getInt("majorId")));
			System.out.println(allStudents.get(allStudents.size()-1).toString());//get last added
		}
		preparedStatement.close();
		set.close();
		return allStudents;
	}
	
	/**
	 * Updates a students address by id
	 * @param id
	 * @param newMajor
	 * @return
	 * @throws SQLException
	 */
	public static void updateByID(int id,String newAddress) throws SQLException {
		String prep = "UPDATE STUDENT SET street = ?  WHERE id = ?";
		PreparedStatement preparedStatement = SQLConnection.connection.prepareStatement(prep);
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, newAddress);
		int set = preparedStatement.executeUpdate();
		System.out.println("Update student "+id+" address. Rows Affected: "+set);	
		preparedStatement.close();
	}

}
