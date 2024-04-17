package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String hospitalname;
		String hospitallocation;
		System.out.println("Enter the hospitalname:");
		hospitalname=scan.next();
		System.out.println("Enter the hospital location:");
		hospitallocation=scan.next();
		System.out.println("hospitalname:"+hospitalname);
		System.out.println("hospitallocation"+hospitallocation);
	}

}
