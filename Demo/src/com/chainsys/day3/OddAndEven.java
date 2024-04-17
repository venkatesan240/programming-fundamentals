package com.chainsys.day3;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(n)) {
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println(i+" is even");
				}else {
					System.out.println(i+" is odd");
				}
			}
			System.out.println("cube of n number :"+n*n*n);
		}
		scan.close();
	}
}
