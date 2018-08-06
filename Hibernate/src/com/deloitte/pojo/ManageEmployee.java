package com.deloitte.pojo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class ManageEmployee {
	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
	      
	      try {
	         factory = new Configuration().configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);//prints this msg in red
	         throw new ExceptionInInitializerError(ex); 
	      }
	      
	     

	      /* Add few employee records in database */
	      ManageEmployee ME = new ManageEmployee();
	      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
	      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
	      Integer empID3 = ME.addEmployee("John", "Paul", 10000);

	  /* List down all the employees */
	      ME.listEmployees();
	      ME.updateEmployee(empID1, 5000);
	      ME.listEmployeeEntityFT();
	      //ME.deleteEmployee(empID2);
	      ME.listEmployees();
	      ME.countEmployee();
	      
	      ME.totalSalary();
	 }
	   
	   /* Method to CREATE an employee in the database */
	   public Integer addEmployee(String fname, String lname, int salary){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employees = new Employee(fname, lname, salary);
	         employeeID = (Integer) session.save(employees); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
	   
	   /* Method to  READ all the employees */
	   public void listEmployees( ){
		   Session session = null;
		   List employees;
		   Transaction tx = null;
		   session = factory.openSession();
	      try {
	         tx = session.beginTransaction();
	         employees = session.createQuery("FROM Employee").list(); 
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
	            Employee employee = (Employee) iterator.next(); 
	            System.out.print("First Name: " + employee.getFirstName()); 
	            System.out.print("  Last Name: " + employee.getLastName()); 
	            System.out.println("  Salary: " + employee.getSalary()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   public void listEmployeeEntityNS() {
		   Session session = factory.openSession();
		   Transaction tx = null;
		   try {
		         tx = session.beginTransaction();
		         String sql = "SELECT * FROM EMPLOYEE";
		         SQLQuery query = session.createSQLQuery(sql);
		         query.addEntity(Employee.class);
		         List employees = query.list();
		         //employees = session.createQuery("FROM Employee").list(); 
		         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
		            Employee employee = (Employee) iterator.next(); 
		            System.out.print("First Name: " + employee.getFirstName()); 
		            System.out.print("  Last Name: " + employee.getLastName()); 
		            System.out.println("  Salary: " + employee.getSalary()); 
		         }
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
	   }
	   public void updateEmployee(Integer EmployeeID, int salary ){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
		         employee.setSalary( salary );
		     session.update(employee); 
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }
	   /*public void deleteEmployee(Integer EmployeeID){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
		         session.delete(employee); 
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }*/	
	   //to print first two salaries. not working
	   public void listEmployeeEntityFT() {
		   Session session = factory.openSession();
		   Transaction tx = null;
		   try {
		         tx = session.beginTransaction();
		         String sql = "FROM EMPLOYEE ORDER BY SALARY DESC";
		         SQLQuery query = session.createSQLQuery(sql);
		         query.addEntity(Employee.class);
		         query.setFirstResult(1);
		         query.setMaxResults(2);
		         List employees = query.list();
		         //employees = session.createQuery("FROM Employee").list(); 
		         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
		            Employee employee = (Employee) iterator.next(); 
		            System.out.print("First Name: " + employee.getFirstName()); 
		            System.out.print("  Last Name: " + employee.getLastName()); 
		            System.out.println("  Salary: " + employee.getSalary()); 
		         }
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
	   }
	   
	   public void countEmployee(){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Criteria cr = session.createCriteria(Employee.class);

		         // To get total row count.
		         cr.setProjection(Projections.rowCount());
		         List rowCount = cr.list();

		         System.out.println("Total Count: " + rowCount.get(0) );
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }
	   
	   public void totalSalary(){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      try {
		         tx = session.beginTransaction();
		         Criteria cr = session.createCriteria(Employee.class);

		         // To get total salary.
		         cr.setProjection(Projections.sum("salary"));
		         List totalSalary = cr.list();

		         System.out.println("Total Salary: " + totalSalary.get(0) );
		         tx.commit();
		      } catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      } finally {
		         session.close(); 
		      }
		   }

	}


