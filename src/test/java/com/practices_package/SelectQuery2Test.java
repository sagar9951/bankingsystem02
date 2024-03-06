package com.practices_package;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;

public class SelectQuery2Test {
	public static void main(String[] args) throws SQLException {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sdet24", "root", "root");
		Statement state = con.createStatement();
		
		String query = "select * from rmg ;";
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
		{
			System.out.print(result.getString(1)+" ");
			System.out.print(result.getString(2)+"   ");
			System.out.print(result.getString(3)+" ");
			System.out.print(result.getString(4));
			System.out.println();
		}
		
		
	}
}
