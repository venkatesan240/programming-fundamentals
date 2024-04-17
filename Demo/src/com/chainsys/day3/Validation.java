package com.chainsys.day3;

public class Validation {

		public boolean Numbers(int number) {
			if(number<0) {
				System.out.println("negative number");
				return false;
			}
				return true;
			
		}
		
		public boolean cheakFloat(float number) {
			if(number<0) {
				System.out.println("negative number");
				return false;
			}
			return true;
		}
		
		public boolean stringValid(String str) {
			if(str.length()<=2 || str == "") {
				System.out.println("invalid input");
				return false;
			}
			return true;
		}

}
