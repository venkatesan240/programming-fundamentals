package com.chainsys.cab;

import java.util.Scanner;

public class FairCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		CabFairCalculator cfc=new CabFairCalculator();
		System.out.println("Enter the km:");
		int km=scan.nextInt();
		if(km>0) {
		System.out.println("choose the cab type");
		System.out.println("1.micro ( Rs.10 per km )");
		System.out.println("2.mini( Rs.15 per km )");
		System.out.println("3.prime (Rs.20 per km)");
		int cab=scan.nextInt();
		switch(cab) {
		case 1:
			cfc.fairCalculator(km,10);
			break;
		case 2:
			cfc.fairCalculator(km,15);
			break;
		case 3:
			cfc.fairCalculator(km,20);
			break;
		default:
			System.out.println("please enter 1 2 or 3");
		}
		}else {
			System.out.println("please enter positive number");
		}
		scan.close();
	}

}
