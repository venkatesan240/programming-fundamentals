package com.chainsys.grocery;

import java.util.Scanner;

public class GroceryTest {

	public static void main(String[] args) {
		int choice;
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
		switch(choice) {
		case 1:
			grocery.priceCalculator("dry fruits",40);
			break;
		case 2:
			grocery.priceCalculator("snacks", 30);
			break;
		case 3:
			grocery.priceCalculator("cooking oil", 50);
			break;
		case 4:
			grocery.priceCalculator("beverages", 20);
			break;
		case 5:
			grocery.priceCalculator("spices", 60);
			break;
		case 6:
			break;
		}
		}while(choice!=6);
		System.out.println("******************");
		System.out.println("Total amount : "+grocery.getPrice());
		System.out.println("******************");
	}

}
