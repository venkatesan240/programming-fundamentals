package com.chainsys.bank;

public abstract class Bank {


	public abstract void interestRate(float interest);
	
	public void loans() {
		System.out.println("housing loan");
		System.out.println("education loan");
	}

}
