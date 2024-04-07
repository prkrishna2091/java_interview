package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java.model.Employee;

public class StreamAPI {
	
	public static void main(String args[]) {
		List<Employee> listOfEmployees = new ArrayList();
		
		listOfEmployees.add(new Employee("Ram",50000.00,33,"IT"));
		listOfEmployees.add(new Employee("Sai",20000.00,31,"ADMIN"));
		listOfEmployees.add(new Employee("Vinod",40000.00,32,"IT"));
		
		listOfEmployees.add(new Employee("Raj",90000.00,38,"IT"));
		listOfEmployees.add(new Employee("Shyam",40000.00,30,"ADMIN"));
		listOfEmployees.add(new Employee("Vinay",45000.00,32,"IT"));
		
		listOfEmployees.add(new Employee("Ramki",95000.00,38,"IT"));
		listOfEmployees.add(new Employee("Shanthi",40000.00,35,"IT"));
		listOfEmployees.add(new Employee("Vimal",45000.00,32,"IT"));
		
		// get the list of employee more than 35000
	List<Employee> result=	listOfEmployees.stream().filter(emp->emp.getSalary()>35000.00).collect(Collectors.toList());
	
	
	
	System.out.println(result.toString());
	
	System.out.println(result.stream().count());
	
	//sort the employess based on age
	
 List<Employee>	listByAge = listOfEmployees.stream().sorted((e1,e2)->e1.getAge().compareTo(e2.getAge())).collect(Collectors.toList());
 System.out.println(listByAge.toString());
 
 System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).toString());
 
 System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting())).toString());
 
 System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).toString());
 
 System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.mapping(Employee::getName, Collectors.toSet()))).toString());
	
 System.out.println(listOfEmployees.stream().max(Comparator.comparing(Employee::getSalary)));
 
 System.out.println(listOfEmployees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).collect(Collectors.toList()).toString());
	}

}
