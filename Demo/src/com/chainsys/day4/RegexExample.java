package com.chainsys.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("is");
		boolean b=m.matches();
		
		boolean b2=Pattern.compile(".s").matcher("is").matches();
		
		boolean b3=Pattern.matches(".s", "is");
		System.out.println(b+" "+b2+" "+b3);
	}

}
