package com.kwa;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	private List<Employee> developer;
	private List<Employee> tester;
	
	public Manager() {
		super();
		this.developer = new ArrayList<>();
		this.developer.add(new Employee(1, "Jim", 100.0));
		this.developer.add(new Employee(4, "Steve", 100.0));
		this.developer.add(new Employee(9, "Marina", 100.0));
		this.tester = new ArrayList<>();
		this.tester.add(new Employee(4, "Steve", 100.0));
		this.tester.add(new Employee(9, "Marina", 100.0));
		this.tester.add(new Employee(1, "Jim", 100.0));
	}


	public boolean compareDepartment(String department1, String department2) {
		List<Employee> dep1 = getEmployees(department1);
		List<Employee> dep2 = getEmployees(department2);
		
		//TODO - implement this method
		
		return false;
	}

	protected List<Employee> getEmployees(String department) {
	
		List<Employee> empList = null;
		
		if("developer".equals(department)) {
			empList = developer;
		} else if("tester".equals(department)) {
			empList = tester;
		} 
		
		return empList;
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("Result = " + manager.compareDepartment("developer","tester"));
	}

}
