package com.practices_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteTableQueryTest {
	public static void main(String[] args) throws SQLException {
		//step 1: register database
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//step 2: get  a connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sdet24", "root", "root");
		
		//step 3 : create a statement
		Statement state = con.createStatement();
		
		//step 4: update query
		// here we are delting the-- rmg table in sdet24 database
		String delQuery = "drop table rmg ;";
		int delResult = state.executeUpdate(delQuery);
		
		//verify
		if(delResult>=1) {
			System.out.println("Table is not  deleted");
		}
		else {
			System.out.println("Table is deleted");
		}
		
	}
}
