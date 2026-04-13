                                                    //Day3 [CRUD operations] :- Create Option 
package com.Adv;

import java.sql.*;

public class Programm2 {
	
	private static final String url = "jdbc:mysql://localhost:3306/myntra";
	private static final String username = "root";
	private static final String password = "root";
	
	
			
	
	public static void main(String[]args) {
		
		//Load the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish Connection 
		
			Connection con = DriverManager.getConnection(url,username,password);
			
		//Create SQL statement 
			Statement stmt = con.createStatement();
			
			String Insert = "INSERT INTO user (user_id,firstName,lastName,email,phone_number,password)"+"VALUES(17,'YASH','GM','gmyashwanth@gmail.com',9739498257,'Yash@111');";
			
			int res = stmt.executeUpdate(Insert );
			System.out.print(res);
			
			
			
			
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
