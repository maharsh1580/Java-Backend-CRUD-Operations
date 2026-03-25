package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update_set {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","");
			String query = "UPDATE registration SET email=? WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,"updatedmaharsh");
			ps.setInt(2, 7);
			int rows = ps.executeUpdate();
			System.out.println("records are updated!");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
