package com.tech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
	public static void main(String[] args) {

		/*
		 * public static java.util.stream.Collector>> groupingBy(Function<? super
		 * Employee, ? extends String> classifier)
		 */

		List<Employee> employees = EmployeeProvider.getEmployees();
		Map<String, List<Employee>> groupByData = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		groupByData.forEach((k, v) -> {
			System.out.println(k + " => " + v);
		});

		/*
		 * groupingBy(Function<? super Employee, ? extends String> classifier,
		 * Collector<? super Employee, Object, Long> downstream)
		 */
		Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);
		
		/*
		 * groupingBy(Function<? super Employee, ? extends Object> classifier,
		 * Supplier<Map<Object, Object>> mapFactory, Collector<? super Employee, Object,
		 * Object> downstream)
		 */
		Map<String, Map<String, Long>> multipleCounting = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.groupingBy(Employee::getGender,
								Collectors.counting())));
		System.out.println(multipleCounting);
	}
}
