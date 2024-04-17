package com.chainsys.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  yourname:");
		String name=scan.next();
		Validation valid=new Validation();
		if(valid.stringValid(name)) {
			try {
				System.out.println("create password(numbers):");
				int password=scan.nextInt();
				if(valid.Numbers(password)) {
					System.out.println("Enter for login credentials:");
					System.out.println("Enter username(name):");
					String userName=scan.next();
					System.out.println("Enter password:");
					int passWord=scan.nextInt();
					if(userName.equals(name) && passWord==password) {
						System.out.println("Login sucessfully...");
					}else {
						System.out.println("invalid username or password");
					}
				}
			}catch(InputMismatchException ime) {
					System.out.println(ime);
				}
			}
	}

}
