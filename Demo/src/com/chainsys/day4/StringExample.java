package com.chainsys.day4;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";
		String str1="world";
		System.out.println(str.charAt(1));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.codePointCount(1, 3));
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.concat(str1));
		System.out.println(str.contains(str1));
		System.out.println(str.contentEquals(str));
		System.out.println(str.contentEquals(str1));
		
		
		
	}

}
