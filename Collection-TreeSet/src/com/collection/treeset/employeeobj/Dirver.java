package com.collection.treeset.employeeobj;

import java.util.Set;
import java.util.TreeSet;

public class Dirver {

	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<Employee>();
		
		Employee e1 = new Employee("krishna","emp12Krish", 76734.24);
		Employee e2 = new Employee("mohan","emp12mohan",   80500.57);
		Employee e3 = new Employee("gorang","emp14gorang", 55596.49);

		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		int count = 1;
		
		for(Employee emp : set) {
			System.out.println("------------------Details of Employee " + count+ "-----------------------------");
			emp.employee();
			count++;
			
		}
	
	}
	

}