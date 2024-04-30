package com.chainsys.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1, "ravi");
		map.put(3, "kumar");
		map.put(2, "ram");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println("decendingmap:"+map.descendingMap());
		System.out.println("headmap:"+map.headMap(2, true));
		System.out.println("tailmap:"+map.tailMap(2, true));
		System.out.println("submap:"+map.subMap(1, true, 3, true));
	}

}
