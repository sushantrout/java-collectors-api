package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToXXX {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		int size = employees.size();
		System.out.println("Actual Size: " + size);

		/*
		 * public static <T, C extends java.util.Collection>
		 * java.util.stream.Collector<T, ?, C>
		 * toCollection(java.util.function.Supplier);
		 * 
		 * public static java.util.stream.Collector<T, ?, java.util.List> toList();
		 * 
		 * public static java.util.stream.Collector<T, ?, java.util.Set> toSet();
		 */
		ArrayList<Employee> collectByCustomCollection = employees.stream()
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("toCollection \t" + collectByCustomCollection);
		
		List<Employee> collectByList = employees.stream().collect(Collectors.toList());
		System.out.println("toList()\t" + collectByList);
		
		Set<Employee> collectBySet = employees.stream().collect(Collectors.toSet());
		System.out.println("toSet\t" + collectBySet);

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
