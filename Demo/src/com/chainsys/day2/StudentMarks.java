package com.chainsys.day2;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=scan.next();
		System.out.println("Enter the tamil marks:");
		int tamil=scan.nextInt();
		System.out.println("Enter the english marks:");
		int english=scan.nextInt();
		System.out.println("Enter the maths marks:");
		int maths=scan.nextInt();
		System.out.println("Enter the science marks:");
		int science=scan.nextInt();
		System.out.println("Enter the social marks:");
		int social=scan.nextInt();
		int total=tamil+english+maths+science+social;
		int avg=total/5;
		System.out.println("name:"+name);
		System.out.println("total:"+total);
		System.out.println("average:"+avg);
		if(avg>=80) {
			System.out.println("grade a");
		}else if(avg>=60 && avg<80){
			System.out.println("grade b");
		}else if(avg>=40 && avg<60) {
			System.out.println("grade c");
		}else {
			System.out.println("grade d");
		}
	}

}
