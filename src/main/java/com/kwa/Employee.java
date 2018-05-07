package com.kwa;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	Integer id;
	
	String name;
	
	Double salary;
	
	List<String> departmentNameList;

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentNameList = new ArrayList<>();
	}
	
	public void addDepartment(String departmentName) {
		this.departmentNameList.add(departmentName);
		
	}

}
