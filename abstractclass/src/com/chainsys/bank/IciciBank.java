package com.chainsys.bank;

import java.util.Random;
import java.util.Scanner;

public class IciciBank extends Bank {

	@Override
	public void interestRate(float interest) {
		// TODO Auto-generated method stub
		System.out.println("icici bank interest rate : "+interest);
		
	}
	Scanner scan=new Scanner(System.in);
	Validation valid=new Validation();
	Random random= new Random();
	
	public void getUserDetails(Bank bank) {
		System.out.println("Welcome to Icici Bank");
		String userName;
		String pattern="[a-zA-Z]{3,15}";
		while(true) {
			System.out.println("Enter the name:");
			userName=scan.next();
			if(userName.matches(pattern)){
				bank.setUserName(userName);
				break;
			}
			System.out.println("invalid input");
		}
		int accountnumber;
		accountnumber=random.nextInt(1000);
		bank.setAccountNumber(accountnumber);
		
		String ifsccode;
		String ifscpattern="[A-Z0-9]{5,12}";
		while(true) {
			System.out.println("Enter the ifsc code");
			ifsccode=scan.next();
			if(ifsccode.matches(ifscpattern)) {
				bank.setIfscCode(ifsccode);
				break;
			}
			System.out.println("invalid input");
		}
		while(true) {
			String branchPattern="[a-z]{3,20}";
			System.out.println("Enter the branch name:");
			String branch=scan.next();
			if(branch.matches(branchPattern)) {
				bank.setBranch(branch);
				break;
			}
			System.out.println("invalid input");
		}
		while(true) {
			System.out.println("Enter the phone number:");
			long phone=scan.nextLong();
			if(valid.Numbers(phone)) {
				bank.setPhoneNumber(phone);
				break;
			}
		}
		System.out.println("Account created sucessfully...");
		System.out.println("your account number: "+bank.getAccountNumber());
	}
	public void printUserdetails(IciciBank icici) {
		// TODO Auto-generated method stub
		System.out.println("user details....");
		System.out.println("**************************");
		System.out.println("username:"+icici.getUserName());
		System.out.println("accountnumber:"+icici.getAccountNumber());
		System.out.println("branch:"+icici.getBranch());
		System.out.println("ifsccode:"+icici.getIfscCode());
		System.out.println("phonenumber:"+icici.getPhoneNumber());
		System.out.println("***************************");
	}

}
