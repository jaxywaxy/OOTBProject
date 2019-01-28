package com.ootbproject;

import java.math.BigDecimal;

public class Employee extends Person {

	private String jobTitle;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String jobTitle) {
		super(name);
		this.jobTitle = jobTitle;
		System.out.println("Employee Constructor");
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + jobTitle + "#" + employerName + "#" + employeeGrade;
	}

}
