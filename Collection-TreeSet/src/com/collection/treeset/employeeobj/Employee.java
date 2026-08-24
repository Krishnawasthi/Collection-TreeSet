package com.collection.treeset.employeeobj;

public class Employee implements Comparable {

	private String EmpName;
	private String EmpId;
	private double salary;

	public Employee(String name, String id, double salary) {
		this.EmpName = name;
		this.EmpId = id;
		this.salary = salary;

	}

	@Override
	public int compareTo(Object obj) {
		Employee emp = (Employee) obj;
		return this.EmpName.compareTo(emp.EmpName) + this.EmpId.compareTo(emp.EmpId)
				+ Double.compare(this.salary, emp.salary);
	}

	public String toString() {
		return this.EmpName + this.EmpId + this.salary;
		
		
	}
	static
	{
		System.out.println("------------------------------------------------- Details of the Employe---------------------------------------------------");
	}

	public void employee() {
		
		System.out.println();
		System.out.println("Name of the emp: " + this.EmpName );
		System.out.println("Id of the emp: " + this.EmpId);
		System.out.println("Salary  of the emp: " + this.salary);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		

	}

}
