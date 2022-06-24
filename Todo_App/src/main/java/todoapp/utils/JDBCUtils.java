package todoapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {
	public static String url = "jdbc:mysql://localhost:3306/todo";
	public static String username = "admin";
	public static String password = "root";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
