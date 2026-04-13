package com.Adv;

import java.sql.*;
public class program1 {
	
	public static void main(String[]args) {
		
		
		
		try {
			//1)Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("Driver loaded Scussfully.......");
			
			
			String url = "jdbc:mysql://localhost:3306/myntra";
			String username = "root";
			String password = "root";
			
			//2)Establish Connection with DB
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection established");
			
			
			System.out.println();
			
			//3)Create SQL statement 
			
			Statement stmt=con.createStatement();
			
			//4) Exeguite   the SQL statment 
			
			String sql = "SELECT * FROM user";
			
			ResultSet res = stmt.executeQuery(sql);
			
			//5) Process the Result
			
			while(res.next()) {
				
				int id = res.getInt("user_id");
				String fname = res.getString("firstName");
				String lname = res.getString("lastName");
				String email = res.getString("email");
				String phone = res.getString("phone_number");
				
				System.out.println(id+" "+fname+" "+lname+" "+email+" "+phone);
					
			}
		}
		catch(ClassNotFoundException e) {
			 e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
