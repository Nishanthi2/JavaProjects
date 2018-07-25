package com.Deloitte.payroll.main;

import com.Deloitte.payroll.Accounts;
import com.Deloitte.payroll.ConfirmedEmployee;
import com.Deloitte.payroll.Contract;
import com.Deloitte.payroll.Employee;
import com.Deloitte.payroll.HR;
import com.Deloitte.payroll.Interns;

public class MainClass {
	public static void main(String[] args) {
		ConfirmedEmployee confirmedemployee = new ConfirmedEmployee();
		confirmedemployee.netSalary();
		
		Accounts accounts = new Accounts();
		accounts.processSalary(confirmedemployee);
		
		Interns interns = new Interns();
		accounts.processSalary(interns);
		
		Contract contract = new Contract();
		accounts.processSalary(contract);
		//once hr is introduced, we can do everything using hr.
		//we don't have to instantiate every subclass. 
		//we create an object of superclasstype,(not instantiation)
		//and call hr's method, by
		//passing this required alphabets as parameter.
		
		HR hr = new HR();
		Employee employee;
		
	    employee = hr.recruit('I');
	    accounts.processSalary(employee);
	    
	    employee = hr.recruit('P');
	    accounts.processSalary(employee);
	    
	    employee = hr.recruit('C');
	    accounts.processSalary(employee);
	    
		
	}
}
