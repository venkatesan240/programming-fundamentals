package com.chainsys.bank;

import java.util.Random;
import java.util.Scanner;


import com.chainsys.hotal.Validation;

public class IndianBank {
	Random random= new Random();
	
	Scanner scan=new Scanner(System.in);
	Validation valid=new Validation();
	
	public void getUserDetails(Bank bank) {
		System.out.println("Welcome to indian bank");
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
		String ifscpattern="[A-Z0-9]{5-12}";
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
			String branchPattern="[a-z]{1}";
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
	
	public void printUserdetails(Bank bank) {
		System.out.println("user details....");
		System.out.println("**************************");
		System.out.println("username:"+bank.getUserName());
		System.out.println("accountnumber:"+bank.getAccountNumber());
		System.out.println("branch:"+bank.getBranch());
		System.out.println("ifsccode:"+bank.getIfscCode());
		System.out.println("phonenumber:"+bank.getPhoneNumber());
		System.out.println("***************************");
	}
	
	public void deposit(int amount,Bank bank) {
		bank.setAccount(amount);
		System.out.println(amount+" deposited sucessfully");
	}
	
	public void deposit(int amount,String name,Bank bank) {
		int balance=bank.getAccount()+amount;
		bank.setAccount(balance);
		System.out.println("for the account holder "+name+ "rs" +amount+" deposited sucessfully");
		System.out.println("balance amount:"+bank.getAccount());
	}
	public void showAvailableSavingPlan() {
		System.out.println("savings plans...");
		System.out.println("Individual – Single Accounts");
			System.out.println("Two or more individuals – Joint Accounts");	
				System.out.println("Illiterate persons");
				System.out.println("Blind persons");
				System.out.println("Associations, Clubs."); 
				System.out.println("Trusts"); 
				System.out.println("Institutions/Agencies/ Societies/Government Departments specially permitted by RBI.");
	}

}
