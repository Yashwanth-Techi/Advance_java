package com.Adv;

import java.sql.*;
public class Programm4 {
	private static final String Url = "jdbc:mysql://localhost:3306/myntra";
	private static final String username = "root";
	private static final String password = "root";
	
	
	public static void main(String[]args) {
	
		
		try {
			//Loading Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish connection 
			
			Connection con = DriverManager.getConnection(Url,username,password);
			
			//Create  Sql statement
			
			Statement  stmt = con.createStatement();
			
			String DELETE = "DELETE FROM user WHERE user_id = 17";
			
			// Execute Sql statement
			
			int res = stmt.executeUpdate(DELETE);
			
			System.out.println(res);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
