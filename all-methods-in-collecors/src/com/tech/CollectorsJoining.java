package com.tech;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		//syntax
		/*
		 * public static java.util.stream.Collector<java.lang.CharSequence, ?,
		 * java.lang.String> joining();
		 * 
		 * public static java.util.stream.Collector<java.lang.CharSequence, ?,
		 * java.lang.String> joining(java.lang.CharSequence);
		 * 
		 * public static java.util.stream.Collector<java.lang.CharSequence, ?,
		 * java.lang.String> joining(java.lang.CharSequence, java.lang.CharSequence,
		 * java.lang.CharSequence);
		 */
		
		//Implemntation
		String joining = employees.stream().map(Employee::getName).collect(Collectors.joining());
		System.out.println("joining()\t" + joining);

		String joiningByComma = employees.stream().map(Employee::getName).collect(Collectors.joining(","));
		System.out.println("joining(CharSequence delimiter)\t" + joiningByComma);

		String joiningByPrefixAndSufix = employees.stream().map(Employee::getName)
				.collect(Collectors.joining(",", "Start -> ", "<-End"));
		System.out.println("joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)\t"
				+ joiningByPrefixAndSufix);
	}
}
