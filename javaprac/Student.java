package com.javaprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student implements Comparator
{
	int id;
	String name;
	int age;
	String DOB;
	
	public Student(int id,String name, int age, String dOB) {
		super();
		this.id = id;
		this.name=name;
		this.age = age;
		DOB = dOB;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", DOB=" + DOB + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		Student a=(Student) o1;
		Student b=(Student) o2;
		
		return a.name.compareTo(b.name);
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> la =new ArrayList<Student>();
		la.add(new Student(1,"Ram", 27, "19-June-1996"));
		la.add(new Student(2,"Shru", 26, "20-Jan-1997"));
		la.add(new Student(3,"Aniket", 25, "21-Dec-1998"));
		//System.out.println(la);
		
		Collections.sort(la,new Student());
		
		Iterator<Student> itr = la.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}

	public Student() {
		super();
	}
}
