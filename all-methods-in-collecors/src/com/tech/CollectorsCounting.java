package com.tech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCounting {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		Long collect = employees.stream().collect(Collectors.counting());
		System.out.println("Size of list = " + collect);
		
		Map<String, Long> countingData = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(countingData);
		
	}
}
