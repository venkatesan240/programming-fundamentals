package com.chainsys.grocery;

import java.util.Scanner;

public class GroceryTest {

	public static void main(String[] args) {
		int choice;
		char buy;
		Scanner scan=new Scanner(System.in);
		GroceryImplementation grocery=new GroceryImplementation();
		System.out.println("welcome to grocery shop");
		do {
		grocery.productList();
		choice=scan.nextInt();
		switch(choice) {
		case 1:
			grocery.getDryFruits();
			break;
		case 2:
			grocery.getSnacks();
			break;
		case 3:
			grocery.getCookingOil();
			break;
		case 4:
			grocery.getBeverages();
			break;
		case 5:
			grocery.getSpices();
			break;
		case 6:
			grocery.getRices();
			break;
		default :
			System.out.println("please enter 1 to 6");
			break;
		}
		System.out.println("do you want to buy any other products(y/n)");
		buy=scan.next().charAt(0);
		}while(buy == 'y');
		grocery.getBill();
		grocery.makePayment();
		scan.close();
	}

}
