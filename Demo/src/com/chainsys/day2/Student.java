package com.chainsys.day2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int id;
		String name;
		int std;
		System.out.println("Enter the student id:");
		id=scan.nextInt();
		System.out.println("Enter the name");
		name=scan.next();
		System.out.println("Enter the standred:");
		std=scan.nextInt();
		System.out.println("student id:"+id);
		System.out.println("student name:"+name);
		System.out.println("Standred:"+std);
	}

}
