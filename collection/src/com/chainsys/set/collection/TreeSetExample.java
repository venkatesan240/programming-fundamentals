package com.chainsys.set.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeSet<String> al=new TreeSet<String>();
			al.add("guna");
			al.add("arun");
			al.add("ram");
			Iterator itr=al.iterator();
			System.out.println("Ascending");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Desending");
			Iterator i=al.descendingIterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
	}

}
