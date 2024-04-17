package com.chainsys.day3;

import java.util.Scanner;

public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=scan.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(limit)) {
			System.out.println("Enter the numbers:");
			int num[]=new int[limit];
			for(int i=0;i<limit;i++) {
				num[i]=scan.nextInt();
			}
			for(int i=0;i<limit;i++) {
				if(num[i]%2==0) {
					System.out.println(num[i]+"even");
				}
			}
		}
		scan.close();
	}

}
