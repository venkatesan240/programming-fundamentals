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
		System.out.println("select products...");
		System.out.println("1.dry fruits");
		System.out.println("2.snacks");
		System.out.println("3.cooking oil");
		System.out.println("4.beverages");
		System.out.println("5.spices");
		System.out.println("6.exit");
		System.out.println("please enter 1 to 5");
		choice=scan.nextInt();
		if(choice<6) {
		switch(choice) {
		case 1:
			grocery.dryFruits();
			break;
		case 2:
			grocery.snacks();
			break;
		case 3:
			grocery.cookingOil();
			break;
		case 4:
			grocery.beverages();
			break;
		case 5:
			grocery.spices();
			break;
		case 6:
			break;
		}
		}
		else {
			System.out.println("please enter between 1 to 6");
		}
		System.out.println("do you want to buy any other products(y/n)");
		buy=scan.next().charAt(0);
		}while(buy == 'y');
		grocery.getBill();
	}

}
