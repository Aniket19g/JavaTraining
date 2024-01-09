package com.javaprac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> aa = new ArrayList<String>();
		aa.add("Aniket");
		aa.add("Niket");
		
		List<String> ab = new ArrayList<String>();
		ab.addAll(aa);
		
		Iterator<String> itr = ab.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//ArrayList Empty or not
		System.out.println(ab.isEmpty());
	}
}
