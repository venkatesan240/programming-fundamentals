package com.chainsys.hashmap;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"arun");
		map.put(2,"kumar");
		map.put(3,"raj");
		System.out.println("initaial list of elements"+map);
//		map.remove(1);
//		System.out.println(map);
//		System.out.println("updated list of elements");
//		map.remove(2);
//		System.out.println(map);
		map.replace(3,"guru");
		System.out.println(map);
		
	}

}
