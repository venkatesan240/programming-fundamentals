package com.chainsys.bank;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IciciBank icici=new IciciBank();
		icici.interestRate((float) 0.06);
		
		SbiBank sbibank=new SbiBank();
		sbibank.interestRate((float) 0.05);
		sbibank.loans();
		
		IndianBank indianbank=new IndianBank();
		indianbank.interestRate((float) 0.07);

	}

}
