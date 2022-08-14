package com.tech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMapping {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		/*
		 * public static <T, U, A, R> java.util.stream.Collector<T, ?, R>
		 * mapping(java.util.function.Function<? super T, ? extends U>,
		 * java.util.stream.Collector<? super U, A, R>);
		 */
		Map<String, List<String>> nameByDepartment = employees.stream()
			.collect(
					Collectors.groupingBy(Employee::getDepartment,
							Collectors.mapping(Employee::getName, Collectors.toList())));
		
		nameByDepartment.forEach((k, v) -> System.out.println(k + " => " + v));
		
	}
}
