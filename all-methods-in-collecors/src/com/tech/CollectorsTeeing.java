package com.tech;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTeeing {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		/*
		 * teeing(Collector<? super Employee, ?, Object> downstream1, Collector<? super
		 * Employee, ?, Object> downstream2, BiFunction<? super Object, ? super Object,
		 * Object> merger)
		 */
		
		HashMap<String, Long> collect = employees.stream().collect(Collectors.teeing(Collectors.counting(),
				Collectors.averagingInt(Employee::getAge), (e1, e2) -> {
			HashMap<String, Long> map = new HashMap<>();
            map.put("Count", e1);
            map.put("Average", e2.longValue());
            return map;
		}));
		
		System.out.println(collect);
	}
}
