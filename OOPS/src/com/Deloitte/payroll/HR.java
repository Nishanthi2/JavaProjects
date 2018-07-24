package com.Deloitte.payroll;

public class HR {
public Employee recruit(char empType) {
	//different ways of recruiting diff types of emp
	Employee employee = null;
	if(empType == 'I') {
		employee = new Interns();		
	}else if(empType == 'P') {
		employee = new ConfirmedEmployee();
	}else if(empType == 'C') {
		employee = new Contract();		
	}
	return employee;
	
}
}
