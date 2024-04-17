package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to my world";
		Pattern p=Pattern.compile("[A-Z]");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
