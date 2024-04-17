package com.chainsys.day3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int temp=0;
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(num)) {
			while(num!=0) {
				int a=num%10;
				temp=temp+a;
				num=num/10;
			}
			System.out.println("sum of digits:"+temp);
		}
		scan.close();
	}

}
