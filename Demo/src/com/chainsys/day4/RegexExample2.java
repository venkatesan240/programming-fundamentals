package com.chainsys.day4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String namePattern="^[A-Za-z]+(?: [A-Za-z]+)*$";
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		Pattern p=Pattern.compile(namePattern);
		Matcher m=p.matcher(name);
		if(m.matches()) {
			System.out.println("valid name");
		}else {
			System.out.println("invalid name");
		}
		String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
		System.out.println("Enter the email:");
		String email=sc.next();
		Pattern p1=Pattern.compile(emailPattern);
		Matcher m1=p1.matcher(email);
		if(m1.matches()) {
			System.out.println("valid email");
		}else {
			System.out.println("invalid email");
		}
		 String mobilePattern = "^[789]\\d{9}$";
		 System.out.println("Enter the mobile:");
		 String mobile=sc.next();
		 Pattern p2=Pattern.compile(mobilePattern);
		 Matcher m2=p2.matcher(mobile);
		 if(m2.matches()) {
			 System.out.println("valid mobile number");
		 }else {
			 System.out.println("invalid mobile number");
		 }
		
	}

}
