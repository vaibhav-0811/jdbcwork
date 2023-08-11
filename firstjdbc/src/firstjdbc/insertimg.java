package firstjdbc;
import java.sql.*;
import java.io.*;

public class insertimg {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.jdbc.Driver"); 
		String url = "jdbc:mysql://localhost:3306/youtube";
		String name= "root";
		String password = "vaibhav0811";
		
		Connection con = DriverManager.getConnection(url,name,password);
		
		if(con.isClosed()) {
			System.out.println("connection is closed ");
			
		}
		else {
			String q = "insert into imgs(pic) values (?)";
			PreparedStatement pstmt =  con.prepareStatement(q);
			//stmt.execute(q);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\New folder\\firstjdbc\\src\\firstjdbc\\milky-way-starry-sky-night-sky-star-956981.jpg");
			
			pstmt.setBinaryStream(1,fis,fis.available());
			
			pstmt.executeUpdate();
			
			con.close();
			
			System.out.println("executed query ...");
		}
		//creating connection 
		
		
		}
		
		catch( Exception e) {
			
			e.printStackTrace();
		}
	}

}
