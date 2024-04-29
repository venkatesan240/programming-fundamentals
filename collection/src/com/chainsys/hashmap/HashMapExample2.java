package com.chainsys.hashmap;

import java.util.HashMap;
import java.util.Map;

class Hotal{
	int id;
	String name;
	Double rating;
	public Hotal(int id, String name, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
}
public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Hotal> map=new HashMap<>();
		Hotal hotal1=new Hotal(101,"saravana bhavan",7.5);
		Hotal hotal2=new Hotal(102,"meenachi bhavan",7.5);
		Hotal hotal3=new Hotal(103,"nellai arya bhavan",7.5);
		map.put(1, hotal1);
		map.put(2, hotal2);
		map.put(3, hotal3);
		for(Map.Entry<Integer, Hotal> entry:map.entrySet()) {
			  int key=entry.getKey();  
		        Hotal h=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(h.id+" "+h.name+" "+h.rating);
		}
	}

}
