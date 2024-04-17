package com.chainsys.day2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String bankname;
		String branch;
		System.out.println("Enter the bankname:");
		bankname=scan.next();
		System.out.println("Enter the branch:");
		branch=scan.next();
		System.out.println("bankname:"+bankname);
		System.out.println("branch:"+branch);
	}

}