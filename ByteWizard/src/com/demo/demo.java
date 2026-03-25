package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","");
			String query = "INSERT INTO registration(username, email, password) VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "Maharsh");
			ps.setString(2, "Maharsh@gmail.com");
			ps.setString(3, "123");
			ps.executeUpdate();
			System.out.println("Data Inserted!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
