package com.chainsys.day3;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int hike;
		System.out.println("Enter Salary: ");
		int salary=sc.nextInt();
		Validation valid=new Validation();
		if(valid.Numbers(salary)) {
			System.out.println("Enter year of expiriance:");
			int year=sc.nextInt();
			if(valid.Numbers(year)) {
				if(year>5) {
					hike=(salary*5/100);
					System.out.println("Salary hiked: "+ hike);
					System.out.println("hiked Salary: "+ (salary+hike));

				}else {
					System.out.println("Salary not hiked ");
				}
			}
		}
		sc.close();

	}

}
