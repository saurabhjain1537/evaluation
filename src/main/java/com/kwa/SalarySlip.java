package com.kwa;

import java.util.Date;

/**
 * Report the total salary payout per month + department 
 *
 */

public class SalarySlip {
	
	private Integer employeeId;
	
	private Date salaryMonth;
	
	private String department;
	
	private Double salaryPayout;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Date getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(Date salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalaryPayout() {
		return salaryPayout;
	}

	public void setSalaryPayout(Double salaryPayout) {
		this.salaryPayout = salaryPayout;
	}
		

}
