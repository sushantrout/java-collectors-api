package com.tech;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsCollectingAndThen {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		Collection<Employee> collect = employees.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableCollection));

		collect.forEach(System.out::println);
	}
}
