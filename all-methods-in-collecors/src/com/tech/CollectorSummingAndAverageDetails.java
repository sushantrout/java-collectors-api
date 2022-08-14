package com.tech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorSummingAndAverageDetails {
	public static void main(String[] args) {

		List<Employee> employees = EmployeeProvider.getEmployees();

		
		/*
		 * public static java.util.stream.Collector
		 * summingInt(java.util.function.ToIntFunction);
		 * 
		 * public static java.util.stream.Collector
		 * summingLong(java.util.function.ToLongFunction);
		 * 
		 * public static java.util.stream.Collector
		 * summingDouble(java.util.function.ToDoubleFunction);
		 */
		
		System.out.println("Summing");
		  
		Map<String, Integer> collect = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getAge)));
		collect.forEach((k, v) -> {
			System.out.println(k+" => " +v);
		});
		
		
		/*
		 * public static java.util.stream.Collector
		 * averagingInt(java.util.function.ToIntFunction);
		 * 
		 * public static java.util.stream.Collector
		 * averagingLong(java.util.function.ToLongFunction);
		 * 
		 * public static java.util.stream.Collector
		 * averagingDouble(java.util.function.ToDoubleFunction);
		 */
		
		System.out.println("Average");
		Map<String, Double> averages = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));
		averages.forEach((k, v) -> {
			System.out.println(k+" => " +v);
		});
	}
}
