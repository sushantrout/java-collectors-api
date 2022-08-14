package com.tech;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMinByMaxBy {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		/* public static java.util.stream.Collector> minBy(java.util.Comparator); */
		System.out.println("minBy()");
		Map<String, String> minDataByColectors = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getSalary)),
								d -> {
									Employee orElse = d.orElse(new Employee());
									return orElse.getName() + " : " + orElse.salary;
								})));

		minDataByColectors.forEach((k, v) -> {
			System.out.println(k + " => " + v);
		});

		/* public static java.util.stream.Collector> maxBy(java.util.Comparator); */
		System.out.println("maxBy()");
		Map<String, String> maxDataByColectors = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
								d -> {
									Employee orElse = d.orElse(new Employee());
									return orElse.getName() + " : " + orElse.salary;
								})));

		maxDataByColectors.forEach((k, v) -> {
			System.out.println(k + " => " + v);
		});
		
	}
}
