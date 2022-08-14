package com.tech;

import java.util.IntSummaryStatistics;
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
		
		Map<Integer, IntSummaryStatistics> collect = employees.stream().collect(
				Collectors.groupingBy(Employee::getId,
						Collectors.filtering(d -> d.getId() < 200, 
								Collectors.mapping(Employee::getAge, 
										Collectors.summarizingInt(Integer::valueOf)))));

		collect.forEach((k, v) -> {
			System.out.println(k + "\t=> " + v);
		});

	}
}
