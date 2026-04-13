                                                          //[CRUD]:-Update operation 

package com.Adv;
import java.sql.*;

public class Program3 {
	
	private static final String url = "jdbc:mysql://localhost:3306/company";
	private static final String username="root";
	private static final String password = "root";
	
	
	public static void main(String[]args) {
		
		//load the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish Connection
			
			Connection con = DriverManager.getConnection(url,username,password);
			
		//Create SQL statement
			
			Statement stmt = con.createStatement();
			
			String UPDATE = "UPDATE employee SET Salary = Salary + 5000 WHERE  D_id = 24";
			
		// Exeguute the SQL Statment
			
			int res = stmt.executeUpdate(UPDATE);
			
			System.out.print(res);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
