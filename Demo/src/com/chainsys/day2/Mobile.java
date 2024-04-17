package com.chainsys.day2;

import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name;
		int price;
		String model;
		System.out.println("Enter mobile name:");
		name=scan.next();
		System.out.println("Enter the price:");
		price=scan.nextInt();
		System.out.println("Enter the model:");
		model=scan.next();
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("model:"+model);
	}

}
