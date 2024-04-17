package com.chainsys.day2;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int year;
		String title;
		double rating;
		System.out.println("Enter the relesed year:");
		year=scan.nextInt();
		System.out.println("Enter the movie title:");
		title=scan.next();
		System.out.println("Enter the rating:");
		rating=scan.nextDouble();
		System.out.println("year:"+year);
		System.out.println("title:"+title);
		System.out.println("rating:"+rating);
	}

}
