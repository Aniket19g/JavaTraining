package com.javaprac;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> ma =new TreeMap<Integer, String>();
		ma.put(1, "Anike");
		ma.put(2,"Niket");
		
		System.out.println(ma.get(1));
	}
}
