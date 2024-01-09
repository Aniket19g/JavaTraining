package com.javaprac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> ma = new HashMap<Integer, String>();
		ma.put(1, "Aniket");
		ma.put(2, "Hello");
		
		System.out.println(ma);
	}
}
