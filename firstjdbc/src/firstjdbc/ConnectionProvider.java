package firstjdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	private static Connection con;
	public static Connection getconnection() throws SQLException {
	
		 try {
			 
			 if (con == null) {
				 Class.forName("com.mysql.jdbc.Driver");
				 
				 String url = "jdbc:mysql://localhost:3306/youtube";
				 String name = "root";
				 String password = "vaibhav0811";		
				 
				 con = DriverManager.getConnection(url,name,password);
			 }
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;

	}
	
	
}
	 
