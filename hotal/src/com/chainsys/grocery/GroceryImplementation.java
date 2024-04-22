package com.chainsys.grocery;

import java.util.Scanner;

import com.chainsys.hotal.Validation;

public class GroceryImplementation {
	Scanner scan=new Scanner(System.in);
	int quantity,amount,totalAmount=0;
	Grocery grocery=new Grocery();
	Validation validate=new Validation();
	
	public void priceCalculator(String product,int price) {
		System.out.println("price of "+product+"(Rs."+price+")");
		while(true) {
			System.out.println("Enter quantity:");
			int quantity=scan.nextInt();
			if(validate.Numbers(quantity)) {
				int amount=quantity*price;
				System.out.println("amount for "+product+" is:"+amount);
				totalAmount=totalAmount+amount;
				grocery.setAmount(totalAmount);
				break;
			}
		}
	}
	
	public int getPrice() {
		return grocery.getAmount();
		
	}
//	public void dryFruits() {
//		int choice;
//		do {
//			System.out.println("1.almont");
//			System.out.println("2.dates");
//			System.out.println("3.cashew nuts");
//			System.out.println("4.exit");
//			choice=scan.nextInt();
//			switch(choice) {
//			case 1:
//				priceCalculator("almont",50);
//				break;
//			case 2:
//				priceCalculator("dates",80);
//				break;
//			case 3:
//				priceCalculator("cashew nuts",100);
//				break;
//			}
//		}while(choice!=4);
//	}

}
