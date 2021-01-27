package com.root.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatement {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/root_infotech","root","root");
			String query="insert into student values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 6);
			pstmt.setString(2, "gaurav");
			pstmt.setString(3, "gaurav@gmail.com");
			pstmt.setString(4, "gaurav123");
			pstmt.addBatch();
			
			pstmt.setInt(1, 7);
			pstmt.setString(2, "vaibhav");
			pstmt.setString(3, "vaibhav@gmail.com");
			pstmt.setString(4, "vaibhav123");
			pstmt.addBatch();
			
			pstmt.setInt(1, 8);
			pstmt.setString(2, "honey");
			pstmt.setString(3, "honey@gmail.com");
			pstmt.setString(4, "honey123");
			pstmt.addBatch();
			
		    pstmt.executeBatch();
			
			
			System.out.println("insert  hoagaya re bava......!!!");
		}
		catch (ClassNotFoundException |SQLException e) 
		 {
			e.printStackTrace();
		 } 


	}

}
