package com.chainsys.day3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int discount;
		System.out.println("Enter Quantity: ");
		int quantity=scan.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(quantity)) {   
			int unit=quantity*100;

			if(unit>1000) {
				discount=(unit*90/100);
				System.out.println("After 10% Discount,the Price will be: "+ discount );
			}
			else {
				System.out.println("Discount Not Applicable for amount: "+ unit);
			}
		}
		scan.close();
	}

}
