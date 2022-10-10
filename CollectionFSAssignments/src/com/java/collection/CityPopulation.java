package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CityPopulation {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("nagpur", 4200000);
		map.put("yavatmal", 765000);
		map.put("mumbai", 98700000);
		map.put("pune", 8670000);
		map.put("dehli", 13287000);

		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		treemap.putAll(map);

		

		for (Map.Entry<String, Integer> entry : treemap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
