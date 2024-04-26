package com.chainsys.grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryTest {
	static ArrayList<UserRegister> userCredentialsList = new ArrayList<>();

	public static void main(String[] args) {
		int choice;
		char buy;
		// Add predefined username-password pairs to the ArrayList
		userCredentialsList.add(new UserRegister(101,"user","password1"));
		Scanner scan=new Scanner(System.in);
		GroceryImplementation grocery=new GroceryImplementation();
		System.out.println("WELCOME TO GROCERY SHOP");
		System.out.println("1.Register");
		System.out.println("2.Login");
		choice=scan.nextInt();
		switch(choice) {
		case 1:
			grocery.getDetails();
			if(grocery.loginCredencial()) {
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
					case 7:
						grocery.getBiscuit();
						break;
					default :
						System.out.println("please enter 1 to 7");
						break;
					}
					System.out.println("do you want to buy any other products(y/n):");
					buy=scan.next().charAt(0);
				}while(buy == 'y');
				grocery.getBill();
				grocery.getDiscount();
				grocery.makePayment();
				scan.close();
			}
			break;
		case 2:
			if(grocery.loginCredencial()) {
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
					case 7:
						grocery.getBiscuit();
						break;
					default :
						System.out.println("please enter 1 to 6");
						break;
					}
					System.out.println("do you want to buy any other products(y/n):");
					buy=scan.next().charAt(0);
				}while(buy == 'y');
				grocery.getBill();
				grocery.getDiscount();
				grocery.makePayment();
				scan.close();
			}
			break;
		}
		
	}

}
