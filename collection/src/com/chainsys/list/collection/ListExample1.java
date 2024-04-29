package com.chainsys.list.collection;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name,dept;
	
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
}
public class ListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		Student student1=new Student(101,"ram","mca");
		Student student2=new Student(102,"mani","cse");
		Student student3=new Student(103,"siva","it");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		for(Student s:list) {
			System.out.println(s.id+" "+s.name+" "+s.dept);
		}
	}

}
