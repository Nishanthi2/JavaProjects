package com.Deloitte.payroll.main;

import com.Deloitte.payroll.Accounts;
import com.Deloitte.payroll.ConfirmedEmployee;
import com.Deloitte.payroll.Contract;
import com.Deloitte.payroll.Employee;
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
	}
}
