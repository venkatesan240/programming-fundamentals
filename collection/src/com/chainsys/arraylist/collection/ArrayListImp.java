package com.chainsys.arraylist.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("hello");
		al.add("hello");
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
