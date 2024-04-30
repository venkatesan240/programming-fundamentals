package com.chainsys.hotal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectUtil {
	
	public static void main(String args[]) throws SQLException {
		
		
       System.out.println(getConnection());
		
	}
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3308/hotal";
        String userName = "root";
        String password = "root";
        Connection connection=DriverManager.getConnection(url, userName, password);
       
	return connection;
	}

}
