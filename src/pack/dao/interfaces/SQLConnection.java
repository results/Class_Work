package pack.dao.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class SQLConnection {
	
	private final String  DBURL  = "jdbc:mariadb://localhost/sba";
	private final String DBUSERNAME = "root";
	private final String  DBPASSWORD = "root";
	private static Connection connection = null;
	
	public SQLConnection() {
		try {
			connection = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
			System.out.println("Connected: "+DBURL);
		} catch (SQLException e) {
			System.out.println("Failed connection.");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void disconnect() throws SQLException {
		if(connection != null)
			connection.close();
		System.out.println("Connections closed.");
	}
	
	public ResultSet query(String statement) throws SQLException {
		return getConnection().createStatement().executeQuery(statement);	
	}
	
	public ResultSet query(PreparedStatement statement) throws SQLException {
		return statement.executeQuery();	
	}
	
	public int update(String statement) throws SQLException {
		return getConnection().createStatement().executeUpdate(statement);	
	}
	
	public int update(PreparedStatement statement) throws SQLException {
		return statement.executeUpdate();	
	}
	
	public PreparedStatement createStatement(String statement) throws SQLException {
		return getConnection().prepareStatement(statement);
		
	}


}
