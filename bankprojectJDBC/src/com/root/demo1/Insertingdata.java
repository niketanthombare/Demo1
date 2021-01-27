package com.root.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertingdata {

	public static void main(String[] args) 
	{
		//query added...
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/root_infotech","root","root");
			String query1="insert into student values(5,'Ketan','ketan@gmail.com','ketan123')";
			String query2="insert into student values(6,'Amol','Amol@gmail.com','Amol123')";
			String query3="insert into student values(7,'Ramesh','Ramesh@gmail.com','Ramesh123')";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query1);
			
		}
		catch (ClassNotFoundException |SQLException e) 
		 {
			e.printStackTrace();
		 } 
	}

}
