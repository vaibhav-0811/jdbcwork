package firstjdbc;
import java.sql.*;
public class myjdbcprogram {
	public static void main(String args[]) 
	{
		
		//exception handling ...
		try {
			Class.forName("com.mysql.jdbc.Driver");     // load the driver 
			String url = "jdbc:mysql://localhost:3306/youtube";
			String name = "root";
			String password="vaibhav0811";
			
			// creating a connection .....
			Connection con = DriverManager.getConnection(url,name,password);
			if(con.isClosed()) {
				
				System.out.println("connection is closed ..");
			}
			else {
				System.out.println("connection established ..");
			}
			
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
