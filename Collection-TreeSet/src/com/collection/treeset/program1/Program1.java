package com.collection.treeset.program1;

import java.util.Set;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		
		Set<String> car = new TreeSet<String>();
		
		car.add("Ferrari");
		car.add("Lamburgini");
		car.add("volks Wagon");
		car.add("Pagani zonda");
		car.add("Masarati");
		//a TreeSet is primarily used when you need to store a collection of unique elements that must be kept in a sorted order.
		System.out.println(car);
	}

}
