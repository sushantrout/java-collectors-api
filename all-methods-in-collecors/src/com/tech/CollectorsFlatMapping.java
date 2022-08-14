package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsFlatMapping {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		Map<String, Map<String, List<Employee>>> employeeByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));

		List<List<Employee>> mapedEmployees = new ArrayList<List<Employee>>();
		for (String department : employeeByDepartment.keySet()) {
			Map<String, List<Employee>> employeeByGender = employeeByDepartment.get(department);
			for (String gender : employeeByGender.keySet()) {
				List<Employee> list = employeeByGender.get(gender);
				mapedEmployees.add(list);
			}
		}
		
		/*
		 * flatMapping(Function<? super List<Employee>, ? extends Stream<? extends
		 * Employee>> mapper, Collector<? super Employee, Object, List<String>>
		 * downstream)
		 */
		
		List<String> collect = mapedEmployees.stream().collect(Collectors.flatMapping(d  -> d.stream(), Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(collect);
	}
}
