package com.ootbproject;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setName("Joe Student");
		 * student.setEmail("joe.student@fmail.com");
		 *
		 *
		 * Person person = new Person(); person.setName("Joe Student");
		 * person.setEmail("joe.student@fmail.com"); person.setPhone("123-345-345");
		 * String value = person.toString(); System.out.println(value);
		 * System.out.println(person);
		 */

		Employee employee = new Employee("Joan Employee", "Developer");
		// employee.setName("Joan Employee");
		employee.setEmail("joan.employee@pmail.com");
		employee.setPhone("543-556-333");
		employee.setEmployeeGrade('a');
		// employee.setJobTitle("Developer");

		System.out.println(employee);
	}

}
