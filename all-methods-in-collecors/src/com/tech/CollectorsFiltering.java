package com.tech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsFiltering {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		/*
		 * filtering(Predicate<? super Employee> predicate, Collector<? super Employee,
		 * Object, List<Integer>> downstream)
		 */
		
		Map<Integer, List<Integer>> collect = employees.stream().collect(
				Collectors.groupingBy(Employee::getId,
						Collectors.filtering(d -> d.getId() < 10, 
								Collectors.mapping(Employee::getAge, 
										Collectors.toList()))));

		collect.forEach((k, v) -> {
			System.out.println(k + "\t=> " + v);
		});

	}
}
