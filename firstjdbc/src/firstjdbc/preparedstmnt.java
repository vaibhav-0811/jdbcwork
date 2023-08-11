package firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class preparedstmnt {

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
			
			
			// query
			
			String q1 = "insert into table1(tname,tcity) values(?,?)";
			
			// create an statement 
			PreparedStatement pstmt = con.prepareStatement(q1);
			// static values......(
			pstmt.setString(1, "Vaibhav"); 
			pstmt.setString(2, "jaipur");
			pstmt.executeUpdate();
			
			//                    )
			
			
			System.out.println(" INSERTED ");
			
			 con.close();
			 
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
