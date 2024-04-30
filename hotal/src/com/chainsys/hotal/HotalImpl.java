package com.chainsys.hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Crud{
	Scanner scan=new Scanner(System.in);
	Hotal hotal=new Hotal();
	Validation validate=new Validation();
	public void getDetails() throws SQLException {
		String query="select id,hotalname,location,phone from hotaldetails";
		Connection connection=ConnectUtil.getConnection();
		 Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery(query);
	       while(rs.next())       {
	 
	    	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	       }
	}
	public  void getHotalDetails() {
		while(true) {
			System.out.println("Enter the hotalname:");
			//scan.nextLine();
			String hotalName=scan.nextLine();
			if(hotalName.matches("[a-zA-Z]{3,15}")) {
				hotal.setHotalName(hotalName);
				break;
			}
		}
		while(true) {
			System.out.println("Enter the location:");
			String location=scan.next();
			if(location.matches("[a-zA-Z]{3,12}")) {
				hotal.setLocation(location);
				break;
			}
		}
		while(true) {
			System.out.println("Enter the phone number:");
			long phone=scan.nextLong();
			if(validate.Numbers(phone)) {
				hotal.setPhoneNumber(phone);
				break;
			}
		}
				System.out.println(hotal.getId());
				System.out.println(hotal.getHotalName());
				System.out.println(hotal.getLocation());
				System.out.println(hotal.getPhoneNumber());
				System.out.println(hotal.toString());
		scan.close();
	}
	
	public void insert() throws SQLException {
		
		System.out.println(hotal);
		String query="insert into hotaldetails(hotalname,location,phone)values(?,?,?)";
		Connection connection=ConnectUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,hotal.getHotalName());
		ps.setString(2,hotal.getLocation());
		ps.setLong(3,hotal.getPhoneNumber());
		int rows=ps.executeUpdate();	
		System.out.println(rows+" row inserted");
	}
	
	public void update() throws SQLException {
		String query="update hotaldetails set location='madurai' where id=2";
		Connection connection=ConnectUtil.getConnection();
		PreparedStatement ps=connection.prepareStatement(query);
		ps.executeUpdate();
		System.out.println("updated");
	}
	
	public void delete() throws SQLException {
		String query="delete from hotaldetails where id=4";
		Connection connection=ConnectUtil.getConnection();
		PreparedStatement ps=connection.prepareStatement(query);
		ps.executeUpdate();
		System.out.println("deleted");
	}
}
public class HotalImpl {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		TestHotal th=new TestHotal();
		Crud crud=new Crud();
		crud.getHotalDetails();
		crud.insert();
		//crud.getDetails();
		//crud.update();
		//crud.delete();
		
	}

}
