package com.Deloitte.payroll;

public abstract class Employee {

	//assuming all properties/attributes such as id are there
	
	public abstract void netSalary();
	
	//we can avoid the implementation if we want to generate one general code
	//but we have to make the method abstract and put a semicolon at the end
	
	//Employee e1= new Employee(); : instantiation not allowed
}
