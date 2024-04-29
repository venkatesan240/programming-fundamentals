package com.chainsys.hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"apple");
		map.put(2,"mango");
		map.put(3,"banana");
		map.put(4,"grapes");
		map.put(1,"gouva");
		System.out.println("iterating hashmap");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
