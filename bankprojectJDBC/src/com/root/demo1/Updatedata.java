package com.root.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatedata 
{
//updated....

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/root_infotech","root","root");
			String query="update student set password='sarpharaz1' where rollno=3";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("update hoagaya");
		}
		catch (ClassNotFoundException |SQLException e) 
		 {
			e.printStackTrace();
		 } 

	}

}
