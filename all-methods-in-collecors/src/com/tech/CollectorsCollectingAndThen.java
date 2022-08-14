package com.tech;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCollectingAndThen {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		employees.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableCollection));

		// nameByDepartment.forEach((k, v) -> System.out.println(k + " => " + v));
	}
}
