package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	
	public final String  DBURL  = "jdbc:mariadb://localhost/sba";
	public final String DBUSERNAME = "root";
	public final String  DBPASSWORD = "root";
	public static Connection connection = null;
	
	public SQLConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
			System.out.println("Connected: "+DBURL);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed connection.");
			e.printStackTrace();
		}
	}

	public static SQLConnection sqlConnection = new SQLConnection();//init
	
	public static void main(String[] args) throws SQLException {
		StudentQueries.findAllStudents();//returns a list
		StudentQueries.updateByID(500, "moms house");
	}

}
