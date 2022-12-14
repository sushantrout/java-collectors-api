package com.tech;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsSummarizing {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		/*
		 * public static java.util.stream.Collector
		 * summarizingInt(java.util.function.ToIntFunction);
		 * 
		 * public static java.util.stream.Collector
		 * summarizingLong(java.util.function.ToLongFunction);
		 * 
		 * public static java.util.stream.Collector
		 * summarizingDouble(java.util.function.ToDoubleFunction);
		 */
		
		IntSummaryStatistics collect = employees.stream()
				.collect(Collectors.collectingAndThen(Collectors.mapping(Employee::getAge,
						Collectors.summarizingInt(Number::intValue)),
						Function.identity()));

		System.out.println(collect);

	}
}
