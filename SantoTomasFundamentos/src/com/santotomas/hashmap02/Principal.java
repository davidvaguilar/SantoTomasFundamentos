/**
 * 
 */
package com.santotomas.hashmap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author David
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		HashMap<Integer, String>  map = new HashMap<Integer, String>();
		map.put(21, "Twenty One"); 
		map.put(21, "Twenty sda");
		
		Integer key = 21; 
		String value = map.get(key);
		System.out.println("Key: " + key +" value: "+ value);
		
		map.put(21, "Twenty One"); 
		map.put(31, "Thirty One"); 
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		while(keySetIterator.hasNext())
		{
			key = keySetIterator.next(); 
			System.out.println("key: " + key + " value: " + map.get(key)); 
		}
		System.out.println("Size of Map: " + map.size()); 
		//map.clear();
		System.out.println("Size of Map: " + map.size());
		
		System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21)); // Clave
		System.out.println("Does HashMap contains 21 as value: " + map.containsValue(21));  //valor
		System.out.println("Does HashMap contains Twenty One as value: " + map.containsValue("Twenty One")); //Value
		
		boolean isEmpty = map.isEmpty(); 
		System.out.println("Is HashMap is empty: " + isEmpty);
		
		 key = 21; 
		 value = map.remove(key); 
		System.out.println("Following value is removed from Map: " + value);

		
		map.put(21, "Twenty One"); 
		map.put(31, "Thirty One"); 
		map.put(41, "Thirty One"); 
		System.out.println("Unsorted HashMap: " + map); 
		TreeMap sortedHashMap = new TreeMap(map); 
		System.out.println("Sorted HashMap: " + sortedHashMap); 
	}

}
