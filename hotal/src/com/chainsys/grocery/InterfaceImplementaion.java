package com.chainsys.grocery;

import java.util.Scanner;

public class InterfaceImplementaion implements GroceryInterface{
	Scanner scan=new Scanner(System.in);
	UserRegister userregister=new UserRegister();
	int j=0;

	public void loginCredencials() {
		// TODO Auto-generated method stub
		System.out.println("USER REGISTOR");
		System.out.println("-------------");
		while(true) {
			System.out.println("enter your name:");
			String name=scan.next();
			if(name.matches("[a-zA-Z]{2,15}")) {
				userregister.setName(name);
				break;
			}
			System.out.println("invalid name");
		}
		while(true) {
			System.out.println("create password:");
			String password=scan.next();
			if(password.matches("[a-zA-z0-9@#]{3,10}")) {
				userregister.setPassword(password);
				System.out.println("Registered Sucessfully");
				break;
			}
			System.out.println("invalid password");
		}
        GroceryTest.userCredentialsList.add(new UserRegister(j++,userregister.getName(), userregister.getPassword()));
		
	}

}
