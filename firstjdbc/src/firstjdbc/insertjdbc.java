package firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertjdbc {

	public static void main(String[] args) {
		
		
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
			
			// query
			
			String q = "create table table1 (tid int(20) primary key auto_increment , tname varchar (200) not null , tcity varchar(100) )";
			
			// create an statement 
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created in database ");
			
			 con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	

}
