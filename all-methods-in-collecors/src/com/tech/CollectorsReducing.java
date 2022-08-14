package com.tech;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsReducing {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		List<Integer> collect = employees.stream().map(e -> e.getAge()).collect(Collectors.toList());

		/* Optional<T> reduce(BinaryOperator<T> accumulator); */
		Integer integer = collect.stream().collect(Collectors.reducing((a, b) -> a + b)).get();
		System.out.println(integer);

		/* T reduce(T identity, BinaryOperator<T> accumulator); */
		Integer integerWithDefaultValue = collect.stream().collect(Collectors.reducing(10, (a, b) -> a + b));
		System.out.println(integerWithDefaultValue);

		/* T reduce(T identity, BinaryOperator<T> accumulator); */
		Integer integerSum = collect.stream().collect(Collectors.reducing(10, Integer::sum));
		System.out.println(integerSum);
		
		/*
		 * java.util.stream.Collectors.reducing(Object identity, Function<? super
		 * Integer, ? extends Object> mapper, BinaryOperator<Object> op)
		 */
		Integer reduceByThreeOperator = employees.stream().collect(Collectors.reducing(10, d -> d.getAge(), (a, b) -> a + b));
		System.out.println(reduceByThreeOperator);

	}
}
