package com.chainsys.day2;

import java.util.Scanner;

public class ArthmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=scan.nextInt();
		System.out.println("Enter the second number:");
		int b=scan.nextInt();
		int add=a+b;
		int sub=a-b;
		int div=a/b;
		int mul=a*b;
		int mod=a%b;
		System.out.println("addition:"+add);
		System.out.println("subtraction:"+sub);
		System.out.println("multiplication:"+mul);
		System.out.println("division:"+div);
		System.out.println("modulas:"+mod);
	}

}
