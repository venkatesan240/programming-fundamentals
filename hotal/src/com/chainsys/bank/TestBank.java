package com.chainsys.bank;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		IndianBank ib=new IndianBank();
		ib.getUserDetails(bank);
		ib.printUserdetails(bank);
		ib.deposit(1000,bank);
		ib.deposit(2000,bank.getUserName(),bank);
		//ib.showAvailableSavingPlan();
	}

}
