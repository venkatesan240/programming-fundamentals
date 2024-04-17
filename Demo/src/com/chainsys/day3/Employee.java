package com.chainsys.day3;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=scan.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(age)) { 
			System.out.println("Enter the gender(M/F)");
			char gender=scan.next().charAt(0);
			if(gender == 'm' || gender == 'f') {
				if(gender == 'f' ) {
					System.out.println("work in urban areas");
				}else if(gender == 'm' && age>=20 && age<=40) {
					System.out.println("work in anywhere");
				}else if(gender == 'm' && age>=40 && age <=60) {
					System.out.println("work in urban areas");
				}else {
					System.out.println("error");
				}
			}else {
				System.out.println("invalid input");
			}
		}
		scan.close();
	}

}
