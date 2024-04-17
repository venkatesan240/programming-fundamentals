package com.chainsys.day3;

import java.util.Arrays;
import java.util.Scanner;

public class FascinatingNumber {

		public static boolean isFascinating(int num) {
	        String concatenated = num + "" + (num * 2) + "" + (num * 3);
	        char[] digits = concatenated.toCharArray();
	        Arrays.sort(digits);
	        
	        for (int i = 0; i < digits.length; i++) {
	            if (digits[i] != (char) ('0' + i + 1)) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (isFascinating(number)) {
	            System.out.println(number + " is a fascinating number.");
	        } else {
	            System.out.println(number + " is not a fascinating number.");
	        }
	        
	        scanner.close();
	    }

}
