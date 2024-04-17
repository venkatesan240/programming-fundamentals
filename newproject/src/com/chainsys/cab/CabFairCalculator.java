package com.chainsys.cab;

import java.util.Scanner;

public class CabFairCalculator {
	int km;
	int amount;
	Scanner sc=new Scanner(System.in);
	
	public boolean couponCode(String couponcode) {
		System.out.println("you can enter this couponcode("+couponcode+") to get 5% discount");
		System.out.println("Enter the coupon code:");
		String coupon=sc.next();
		if(coupon.equals(couponcode)) {
			return true;
		}else {
			System.out.println("coupon mismatch");
		}
		return false;
	}
	
	public void discountCalculator(int amount) {
		if(amount>5000) {
			if(couponCode("COUP_5")) {
				double discount=amount*0.05;
				System.out.println("after 5% discount payable amount is:"+(amount-discount));
			}
		}else if(amount>2000) {
			if(couponCode("COUP_2")) {
				double discount=amount*0.02;
				System.out.println("after 2% discount payable amount is:"+(amount-discount));
			}
		}
		
	}
	public void fairCalculator(int km,int amt) {
		this.km=km;
		amount=km*amt;
		System.out.println("your fair for "+km+" km is: "+amount);
		discountCalculator(amount);
	}
	
}
