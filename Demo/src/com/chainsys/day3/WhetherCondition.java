package com.chainsys.day3;

import java.util.Scanner;

public class WhetherCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Is it raining? (yes/no): ");
	        String rainInput = scanner.nextLine();

	        if (rainInput.equalsIgnoreCase("yes")) {
	            System.out.println("It's raining. Don't forget to bring an umbrella!");
	        } else if (rainInput.equalsIgnoreCase("no")) {
	            System.out.println("It's not raining.");
	        } else {
	            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
	            return;
	        }

	        System.out.println("What is the temperature (in Fahrenheit)? ");
	        double temperature = scanner.nextDouble();

	        if (temperature < 32) {
	            System.out.println("It's very cold. Bring a heavy jacket!");
	        } else if (temperature >= 32 && temperature < 50) {
	            System.out.println("It's cold. Bring a light jacket.");
	        } else {
	            System.out.println("It's not too cold. No jacket needed.");
	        }
	    }

}
