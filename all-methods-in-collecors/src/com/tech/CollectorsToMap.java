package com.tech;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		/*
		 * toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ?
		 * extends U> valueMapper)
		 */
		try {
			// Solving Key Conflicts
			Map<Integer, String> collect = employees.stream()
					.collect(Collectors.toMap(Employee::getId, Employee::getName));
			System.out.println(collect);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		/*
		 * toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ?
		 * extends U> valueMapper, BinaryOperator<U> mergeFunction)
		 */

		Map<Integer, String> collect = employees.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getName, (k, v) -> k));
		System.out.println(collect);

		/*
		 * toMap(Function<? super Employee, ? extends Integer> keyMapper, Function<?
		 * super Employee, ? extends String> valueMapper, BinaryOperator<String>
		 * mergeFunction, Supplier<Map<Integer, String>> mapFactory)
		 */
		
		LinkedHashMap<Integer, String> hashMapCollection = employees.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getName, (k, v) -> k, LinkedHashMap::new));
		System.out.println(hashMapCollection);

	}
}
