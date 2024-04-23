package com.chainsys.bank;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="[a-zA-Z]{3,15}";
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Please enter the bank to create account");
			System.out.println("(sbi/indian/icici)");
			String bank=scan.next();
			if(bank.matches(pattern)) {

				if(bank.equals("icici")) {
					IciciBank icici=new IciciBank();
					icici.getUserDetails(icici);
					icici.printUserdetails(icici);
					icici.interestRate((float) 0.06);
				}
				if(bank.equals("sbi")) {
					SbiBank sbibank=new SbiBank();
					sbibank.getUserDetails(sbibank);
					sbibank.printUserdetails(sbibank);
					sbibank.interestRate((float) 0.05);
				}
				if(bank.equals("indian")) {
					IndianBank indianbank=new IndianBank();
					indianbank.getUserDetails(indianbank);
					indianbank.printUserdetails(indianbank);
					indianbank.interestRate((float) 0.07);
				}
				break;
			}
			System.out.println("invalid input");
		}
		scan.close();
	}

}
