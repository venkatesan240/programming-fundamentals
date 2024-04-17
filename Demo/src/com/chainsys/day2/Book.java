package com.chainsys.day2;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int bookid;
		String bookname;
		String author;
		System.out.println("Enter the book id:");
		bookid=scan.nextInt();
		System.out.println("Enter the book name:");
		bookname=scan.next();
		System.out.println("Enter the author:");
		author=scan.next();
		System.out.println("bookid:"+bookid);
		System.out.println("bookname:"+bookname);
		System.out.println("author:"+author);
	}

}
