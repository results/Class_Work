package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	static final String DB_URL = "jdbc:mariadb://localhost/demodb";
	static final String USER = "root";
	static final String PASS = "root";
	static Connection connection = null;
	private static Statement statement;

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected to database: "+DB_URL);
			
			statement = connection.createStatement();
			String findAll = "SELECT * FROM EMPLOYEE";
			
			ResultSet result = statement.executeQuery(findAll);
			while(result.next()) {
				System.out.println(result.getInt("EmployeeId"));
				System.out.println(result.getString("Name"));
				System.out.println(result.getInt("ManagerId"));
				System.out.println(result.getString("Title"));
			}
			result.close();
			String prep = "SELECT * FROM EMPLOYEE WHERE TITLE = ?";
			PreparedStatement st = connection.prepareStatement(prep);
			st.setString(1, "manager");
			ResultSet set = st.executeQuery();
			while(set.next()) {
				System.out.println(set.getInt("EmployeeId"));
				System.out.println(set.getString("Name"));
				System.out.println(set.getInt("ManagerId"));
				System.out.println(set.getString("Title"));
			}
			st.close();
			set.close();
			String ins = "INSERT INTO EMPLOYEE(Name,ManagerId,Title) VALUE (?,?,?)";
			PreparedStatement insp;
//			insp = connection.prepareStatement(ins);	
//			insp.setString(1, "Douggle");
//			insp.setInt(2, 69);
//			insp.setString(3, "CEO");
//			int resp = insp.executeUpdate();
//			System.out.println(resp+" Inserted");
			String up = "UPDATE EMPLOYEE SET Name = ? WHERE EmployeeId = ?";
			insp = connection.prepareStatement(up);
			insp.setString(1, "sloo");
			insp.setInt(2, 5);
			int b = insp.executeUpdate();
			System.out.println(b);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
