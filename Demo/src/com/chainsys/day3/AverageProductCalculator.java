package com.chainsys.day3;

import java.util.Scanner;

public class AverageProductCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int product = 1;
        String userInput;

        System.out.println("Enter integers (press 'q' to quit):");
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                break;
            }
            int number = Integer.parseInt(userInput);
            sum += number;
            product *= number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
    }

}
