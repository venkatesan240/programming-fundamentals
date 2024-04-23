package com.chainsys.grocery;

import java.util.Scanner;

import com.chainsys.hotal.Validation;

public class GroceryImplementation {
	Scanner scan=new Scanner(System.in);
	int quantity,amount,totalAmount=0;
	Grocery grocery=new Grocery();
	Validation validate=new Validation();
	int choice,i=0;
	
	public void priceCalculator(String product,int price) {
		//System.out.println("price of "+product+"(Rs."+price+")");
		//System.out.println("Available Stock :"+ stock);
		while(true) {
			System.out.println("Enter quantity:");
			quantity = scan.nextInt();
			if(validate.Numbers(quantity)) {
				grocery.product[i]=product;
				grocery.quantity[i]=quantity;
				grocery.price[i]=price;
				int amount=quantity*price;
				grocery.amount[i]=amount;
				System.out.println("amount for "+product+" is:"+amount);
				totalAmount=totalAmount+amount;
			    grocery.setTotalamount(totalAmount);
			    //stock -=quantity;i++
			    i++;
				break;
			}
		}
	}

	public void getBill() {
		System.out.println("**********************************");
		System.out.println("product   price   quantity   price");
		System.out.println("**********************************");
		for(int j=0;j<i;j++) {
			System.out.println(grocery.product[j]+"       "+grocery.price[j]+"      "+grocery.quantity[j]+"       "+grocery.amount[j]);
		}
		System.out.println("**********************************");
		System.out.println("Total amount :                "+grocery.getTotalamount());
		System.out.println("**********************************");
	}
	
		public void dryFruits() {
			
			do {
				System.out.println("1.almont(40Rs)");
				System.out.println("2.dates(80Rs)");
				System.out.println("3.cashew nuts(100Rs)");
				System.out.println("4.exit");
				choice=scan.nextInt();
				switch(choice) {
				case 1:
					priceCalculator("almond",40);
					break;
				case 2:
					priceCalculator("dates",80);
					break;
				case 3:
					priceCalculator("cashew nuts",100);
					break;
				}
			}while(choice!=4);
		}
		
		public void snacks() {
			do {
				System.out.println("1.kurkura(20Rs)");
				System.out.println("2.lays(20Rs)");
				System.out.println("3.murukku(40Rs)");
				System.out.println("4.chips(10Rs)");
				System.out.println("5.exit");
				choice=scan.nextInt();
				switch(choice) {
				case 1:
					priceCalculator("kurkura",20);
					break;
				case 2:
					priceCalculator("lays",20);
					break;
				case 3:
					priceCalculator("murukku",40);
					break;
				case 4:
					priceCalculator("chips",10);
					break;
				}
			}while(choice!=5);
		}

		public void cookingOil() {
			do {
				System.out.println("1.sunflower(150Rs)");
				System.out.println("2.fortuner(100Rs)");
				System.out.println("3.ithayam(200Rs)");
				System.out.println("4.exit");
				choice=scan.nextInt();
				switch(choice) {
				case 1:
					priceCalculator("sunflower",150);
					break;
				case 2:
					priceCalculator("fortuner",100);
					break;
				case 3:
					priceCalculator("ithayam",200);
					break;
				}
			}while(choice!=4);
		}

		public void beverages() {
			do {
				System.out.println("1.coco cola(40Rs)");
				System.out.println("2.pepsi(50Rs)");
				System.out.println("3.mountain due(30rs)");
				System.out.println("4.7up(40Rs)");
				System.out.println("5.exit");
				choice=scan.nextInt();
				switch(choice) {
				case 1:
					priceCalculator("coco cola",40);
					break;
				case 2:
					priceCalculator("pepsi",50);
					break;
				case 3:
					priceCalculator("mountain due",30);
					break;
				case 4:
					priceCalculator("7up",40);
					break;
				}
			}while(choice!=5);
		}
		
		public void spices() {
			do {
			System.out.println("1.mutton masala(10Rs)");
			System.out.println("2.chicken masala(10Rs)");
			System.out.println("3.panner masala(20Rs)");
			System.out.println("4.fish masala(10Rs)");
			System.out.println("5.exit");
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				priceCalculator("mutton masala",10);
				break;
			case 2:
				priceCalculator("chicken masala",10);
				break;
			case 3:
				priceCalculator("panner masala",20);
				break;
			case 4:
				priceCalculator("fish masala",10);
				break;
			}
			}while(choice!=5);
		}

}
