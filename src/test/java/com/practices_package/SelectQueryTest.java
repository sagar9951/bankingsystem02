package com.practices_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement state = null;
		
		
			//step 1: Register database
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2: Get connection for database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sdet24", "root", "root");
			
			//step 3: Create Statement
			state = con.createStatement();
			
			String query = " insert into rmg values(106,'Summer4','JIRA','1 month'),(107,'Summer5','HTML','1 month'),(108,'absa2','Eclipse','1 month');";
			
			//step 4 : Update query
			int result = state.executeUpdate(query);
			
			if(result>=1) {
				System.out.println("Data is updated");
			}
			else
			{
				System.out.println("Data failed to update");
			}
			
			//to print all the data from table
			String query1 = " select * from rmg;";
			ResultSet result1 = state.executeQuery(query1);
			
			while(result1.next()) {
				System.out.println(result1.getString(1)+" "+result1.getString(2)+" "+result1.getString(3)+" "+result1.getString(4));
			}
			
		
		
	}
}
