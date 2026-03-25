package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class show {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","");
			//String query = "SELECT * FROM registration WHERE id = ?";
			String query = "SELECT * FROM registration";
			PreparedStatement ps = con.prepareStatement(query);
			//ps.setInt(1,7);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(
					rs.getInt("id")+
					rs.getString("username")+
					rs.getString("email")+
					rs.getString("password")
					);
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
}
