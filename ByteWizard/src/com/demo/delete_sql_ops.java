package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete_sql_ops {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","");
			String query = "DELETE FROM registration WHERE id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 1);
			int rows = ps.executeUpdate();
			System.out.println(rows + "Record Deleted!");
			con.close();
		}
		catch(Exception e){
			e.getMessage();
		}
	
	}
}
