package com.java.model;

public class Employee {

	private String name;
	
    private Double salary;
	
	private Integer age;
	
	private String department;
	
	
	public Employee(String name, Double salary, Integer age, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", department=" + department + "]";
	}

	
}
