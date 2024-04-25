package com.chainsys.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MobileDb {
	
	public void dbConnection() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
			
			  Statement stmt=con.createStatement(); ResultSet
			  rs=stmt.executeQuery("select * from specification"); while(rs.next())
			  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
			  +"  "+rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getString(6)); con.close();
			 
			}catch(Exception e) {
				System.out.println(e);
			}
	}
}
