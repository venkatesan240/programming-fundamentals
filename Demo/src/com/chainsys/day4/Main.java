package com.chainsys.day4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        String namePattern = "[a-zA-Z]+([ '-][a-zA-Z]+)*"; 
	        String emailPattern = "^[a-z0-9_+&*-]+(?:\\.[a-z0-9_+&*-]+)*@(?:[a-z0-9-]+\\.)+[a-z]{2,7}$"; 
	        String mobilePattern = "^[789]\\d{9}$";
	        String passwordPattern="[a-zA-Z0-9#*@]{8,14}";
	        
	        String name;
	        while (true) {
	            System.out.print("Enter your name(alphbets): ");
	            name = scanner.nextLine();
	            if (name.matches(namePattern)) {
	                break;
	            }
	            System.out.println("Invalid name.Please enter only alphabets");
	        }
	        
	        String email;
	        while (true) {
	            System.out.print("Enter your email address: ");
	            email = scanner.nextLine();
	            if (email.matches(emailPattern)) {
	                break;
	            }
	            System.out.println("Invalid email address.please enter [a-z0-9@]");
	        }
	        
	        String mobile;
	        while (true) {
	            System.out.print("Enter your mobile number: ");
	            mobile = scanner.nextLine();
	            if (mobile.matches(mobilePattern)) {
	                break;
	            }
	            System.out.println(" mobile number must have 10 numbers");
	        }
	        
	        String password;
	        while(true) {
	        	System.out.println("Enter the password:");
	        	password=scanner.next();
	        	if(password.matches(passwordPattern)) {
	        		break;
	        	}
	        	System.out.println(" password must have [8-14a-z0-9]");
	        }
	        
	        System.out.println("Your details...");
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("mobile:"+mobile);
	        
	        scanner.close();
	}

}
