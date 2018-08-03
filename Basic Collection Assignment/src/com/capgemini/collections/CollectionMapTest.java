//Main class to test Map
package com.capgemini.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CollectionMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a hashmap
		Map<String, String> students = new HashMap<String, String>();
		students.put("Udit", "Mango");
		students.put("Rahul", "Banana");
		students.put("Ripudaman", "Apple");
		students.put("Alok", "Chikoo");
		students.put("Gaurav", "Pineapple");
		students.put("Mayur", "Strawberry");
		// converting map to set for traversing
		Set<Entry<String, String>> set = students.entrySet();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// getting value by giving key
		System.out.println("Please input a key value->");

		System.out.println(students.get(str));

		// type and type of set
		for (Entry<String, String> e : set) {
			System.out.println("Name: " + e.getKey() + " ** Favourite Fruit: " + e.getValue());
		}

	}

}
