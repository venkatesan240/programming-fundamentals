package com.chainsys.hotal;

import java.util.Scanner;

public class TestHotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Validation validate=new Validation();
		Hotal hotal=new Hotal();
		while(true) {
			System.out.println("Enter the id:");
			int id=scan.nextInt();
			if(validate.Numbers(id)) {
				hotal.setId(100);
				break;
			}
		}
		while(true) {
			System.out.println("Enter the hotalname:");
			scan.nextLine();
			String hotalName=scan.nextLine();
			if(validate.stringValid(hotalName)) {
				hotal.setHotalName("saravanbhava");
				break;
			}
		}
		while(true) {
			System.out.println("Enter the location:");
			String location=scan.next();
			if(validate.stringValid(location)) {
				hotal.setLocation("madurai");
				break;
			}
		}
		while(true) {
			System.out.println("Enter the phone number:");
			long phone=scan.nextLong();
			if(validate.Numbers(phone)) {
				hotal.setPhoneNumber(985643085);
				break;
			}
		}
		System.out.println(hotal.getId());
		System.out.println(hotal.getHotalName());
		System.out.println(hotal.getLocation());
		System.out.println(hotal.getPhoneNumber());
		System.out.println(hotal.toString());
	}

}
