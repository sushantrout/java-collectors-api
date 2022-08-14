package com.tech;

import java.util.List;

public class CollectorsMapping {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		/*
		 * public static <T, U, A, R> java.util.stream.Collector<T, ?, R>
		 * mapping(java.util.function.Function<? super T, ? extends U>,
		 * java.util.stream.Collector<? super U, A, R>);
		 */
	}
}
