package com.practices_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement state = null;
		int result3 = 0;
		
		try {
			//step 1: Register database
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2: Get connection for database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sdet24", "root", "root");
			
			//step 3: Create Statement
			state = con.createStatement();
			
			//step 4 : Update query and store it 
			String query3 = " insert into rmg values(116,'Spring4','JAVA','3 months');";
			 result3 = state.executeUpdate(query3);	
		}
		catch(Exception e) {
		}
		finally {
			if(result3 ==1) {
				System.out.println("Data updated successfully");
			}
			else
			{
				System.out.println("Data failed to update");
			}
			// step 5: close the connection
			con.close();
			System.out.println("-------------close db connection-----------------");
		}
	}
}
