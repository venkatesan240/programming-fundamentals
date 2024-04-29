package com.chainsys.list.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[]args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2, 25);
		list.add(30);
		System.out.println(list);
		
		for(Integer number:list) {
			System.out.println(number);
		}
		
		System.out.println("getting element"+list.get(0));
		System.out.println("after changing the element");
		list.set(1, 15);
		for(Integer number:list) {
			System.out.println(number);
		}
		
	}

}
