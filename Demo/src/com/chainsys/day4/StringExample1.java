package com.chainsys.day4;

public class StringExample1 {
	public static void main(String[] args) {
		String str="hello world";
		String str1="world";
		String str2="WORLD";
		System.out.println(str.endsWith(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.format(str2, args));
		System.out.println(str.hashCode());
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf('o', 1));
		System.out.println(str.indexOf(str1));
		System.out.println(str.indexOf(str1, 4));
		System.out.println(str.length());
		System.out.println(str.isEmpty());
	}

}
