package com.tech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		/*
		 * public static java.util.stream.Collector>>
		 * partitioningBy(java.util.function.Predicate);
		 */
		
		Map<Boolean, List<Employee>> partitioningBy = employees.stream()
				.collect(Collectors.partitioningBy(d -> "Male".equalsIgnoreCase(d.getGender())));
		
		partitioningBy.forEach((k, v) -> {
			System.out.println(k+" => "+v);
		});
		
		Map<Boolean, Map<String, Long>> employeesGroup = employees.stream()
		.collect(Collectors.partitioningBy(d -> "Male".equalsIgnoreCase(d.getGender()), 
				Collectors.groupingBy(Employee::getDepartment,
						Collectors.filtering(d -> d.getId() < 10, 
								Collectors.counting()))));
		
		employeesGroup.forEach((k, v) -> {
			System.out.println(k+" => "+v);
		});
	}
}
