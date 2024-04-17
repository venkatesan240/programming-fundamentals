package com.chainsys.day3;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int mul=scan.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(mul)) {
			System.out.println("Enter the limit:");
			int limit=scan.nextInt();
			for(int i=1;i<=limit;i++) {
				System.out.println(i+"*"+mul+"="+i*mul);
			}
		}
		scan.close();
	}

}
