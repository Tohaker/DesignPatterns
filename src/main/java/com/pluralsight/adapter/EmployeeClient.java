package com.pluralsight.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();

		// First we create a "normal" employee (i.e. one that we know can be added to a list).
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		
		employees.add(employeeFromDB);
		
		// Will not work! This is where the adapter comes into play!
		// This closely represents our "legacy code" - code that we either cannot or will not change. Because
		// EmployeeLdap doesn't implement an Employee, we can't add it to the list.
		// Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		// This adapter represents the EmployeeLdap as an Employee object, as it implements one.
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

		// The same goes from the EmployeeCSV.
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
		
	}
	
}
