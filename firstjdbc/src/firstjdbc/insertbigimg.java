package firstjdbc;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import firstjdbc.ConnectionProvider;

import javax.swing.*;

public class insertbigimg {

	public static void main(String[] args) {
		
		try {
			
			
			
			Connection c = ConnectionProvider.getconnection();
			String q = "insert into imgs(pic) value(?)";
			
			PreparedStatement pstmt = c.prepareStatement(q);
			
			// we use component of Swing which will provide us dialog window/box 
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			File file=	jfc.getSelectedFile();			
			FileInputStream fis = new FileInputStream(file);
			
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			
			c.close();
			
			
		}catch(Exception e) {
			
		e.printStackTrace();
		}

	}

}
