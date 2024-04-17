package com.chainsys.day3;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of class held:");
		float held=scan.nextInt();
		Validation valid=new Validation();
		if(valid.cheakFloat(held)) {
			System.out.println("Enter the number of class attended:");
			float attended=scan.nextInt();
			if(valid.cheakFloat(attended)) {
				float percent=(attended/held)*100;
				System.out.println(percent+"percentage of class attended");
				if(percent>75) {
					System.out.println("you are allowded to attend the exam");
				}else {
					System.out.println("do you have medical cause(y/n):");
					char medic=scan.next().charAt(0);
					if(medic == 'y') {
						System.out.println("you are allowded to attend the exam");
					}else {
						System.out.println("you are not allowded to attend the exam");
					}

				}
			}
			scan.close();
		}
	}

}
