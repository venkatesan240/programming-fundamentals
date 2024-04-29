package com.chainsys.set.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> data=new LinkedHashSet<>();
		data.add("mani");
		data.add("kumar");
		data.add("raj");
		data.add("kumar");
		System.out.println(data);
		ArrayList list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		data.addAll(list);
		System.out.println(data);
		System.out.println(data.contains("kumar"));
		System.out.println(data.isEmpty());
		Iterator itr=data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		data.remove(10);
		data.remove("kumar");
		System.out.println("after removel"+data);
		//size
		System.out.println(data.size());
	
	}

}
