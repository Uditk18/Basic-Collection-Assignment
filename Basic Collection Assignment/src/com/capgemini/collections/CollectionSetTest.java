//Test class to test HashSet collection

//It contains duplicate values, but Hashset won't take duplicate values and order is not maintained

package com.capgemini.collections;

import java.util.Set;
import java.util.HashSet;

//Main test class to test collection type HashSet

public class CollectionSetTest {
	public static void main(String[] args) {

		// Adding elements to Laptop HashSet
		Set<Laptop> laptop = new HashSet<>();
		laptop.add(new Laptop("Apple", "MacbookPro", "MacOs", "i7"));
		laptop.add(new Laptop("Apple", "MacbookPro", "MacOs", "i7"));
		laptop.add(new Laptop("Dell", "XPS15", "Windows", "i7"));
		laptop.add(new Laptop("HP", "Omen", "Windows", "i7"));
		// Printing the laptop HashSet
		for (Laptop lap : laptop) {
			System.out.println(lap);
		}

		System.out.println();

		// Adding elements to Car HashSet
		Set<Car> car = new HashSet<>();
		car.add(new Car("Audi", "A8", 2017, 1_20_00_000));
		car.add(new Car("BMW", "i8", 2018, 2_35_00_000));
		car.add(new Car("Toyota", "Fortuner", 2016, 26_00_000));
		car.add(new Car("Audi", "A8", 2017, 1_20_00_000));
		car.add(new Car("BMW", "i8", 2018, 2_35_00_000));
		car.add(new Car("Toyota", "Fortuner", 2016, 26_00_000));
		// Printing the Car HashSet
		for (Car cars : car) {
			System.out.println(cars);
		}

		System.out.println();

		// Adding elements to Television HashSet
		Set<Television> tv = new HashSet<>();
		tv.add(new Television("Sony", "LED", true, 50_000));
		tv.add(new Television("Samsung", "Plasma", false, 35_000));
		tv.add(new Television("Sony", "LED", true, 50_000));
		tv.add(new Television("Samsung", "Plasma", false, 35_000));
		tv.add(new Television("LG", "LCD", true, 67_000));
		// Printing the television HashSet
		for (Television tvs : tv) {
			System.out.println(tvs);
		}

		System.out.println();

		// Adding elements to Cellphone HashSet
		Set<CellPhone> cell = new HashSet<>();
		cell.add(new CellPhone("Apple", "X", "Dual Camera", "iOS", 80_000));
		cell.add(new CellPhone("Samsung", "S8", "Super Slow Motion", "Android", 35_000));
		cell.add(new CellPhone("Mi", "A2", "Affordable", "MiUi", 17_000));
		// Printing the Cellphone HashSet
		for (CellPhone cellphone : cell) {
			System.out.println(cellphone);
		}

		System.out.println();

		// Adding elements to School HashSet
		Set<School> sch = new HashSet<>();
		sch.add(new School("DPS Mathura Road", "Delhi", "Delhi", 1));
		sch.add(new School("Birla Public School", "Pilani", "Pilani", 3));
		sch.add(new School("Sanawar Public School", "Sanawar", "Solan", 2));
		// Printing the School HashSet
		for (School school : sch) {
			System.out.println(school);
		}

	}
}