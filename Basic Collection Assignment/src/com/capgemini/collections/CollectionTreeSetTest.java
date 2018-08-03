//Main class to test TreeSet

package com.capgemini.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// names of students
		Set<String> names = new TreeSet<>();
		names.add("Udit");
		names.add("Ripudaman");
		names.add("Ripudaman");

		names.add("Rahul");
		names.add("Mayur");
		names.add("Alok");

		// Note that output will be arranged in alphabetical order and duplicates are
		// removed
		for (String name : names) {
			System.out.println(name);
		}

		// Adding elements to Car treeset

		Set<Car> car = new TreeSet<>();
		car.add(new Car("Audi", "A8", 2017, 1_20_00_000));
		car.add(new Car("Maruti", "i8", 2018, 2_35_00_000));
		car.add(new Car("Toyota", "Fortuner", 2016, 26_00_000));
		// Printing the Car treeset
		// output will be sorted according to make of car and duplicates will be removed
		for (Car cars : car) {
			System.out.println(cars);
		}
		System.out.println();

	}

}
