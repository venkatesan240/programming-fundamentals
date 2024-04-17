package com.chainsys.arrays;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] numbers= {-1,0,9,-2,5,2};
		char[] letters= {'a','g','d','c','h'};
		Arrays.sort(numbers);
		Arrays.sort(letters);
		for(int num:numbers) {
			System.out.print(num+"");
		}
		System.out.println();
		for(char letter:letters) {
			System.out.print(letter);
		}
	}
}
