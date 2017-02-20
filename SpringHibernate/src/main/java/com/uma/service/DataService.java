package com.uma.service;

import java.util.List;

import com.uma.domain.Employee;

/**
 * Interface that have different method that provide Data Service on based on Employee Information.. 
 * @author um@.
 *
 */
public interface DataService {
	/**
	 * To insert A Particular Employee Record.
	 * @param employee 
	 * @return int.
	 */
	public int insertRow(Employee employee);

	 /** This method provide the List of All Employee present in Database.
	 * @return List<Employee>
	 */
	public List<Employee> getList();

	 /**
	  * To select a particular Employee Corresponding to their Id.
	 * @param id(int)
	 * @return Employee object
	 */
	public Employee getRowById(int id);

	 /**
	  * TO UPDATE OR MODIFY EMPLOYEE INFO BY PASSING THAT EMPLOYEE OBJECT 
	 * @param employee
	 * @return INT
	 */
	public int updateRow(Employee employee);

	 /**
	  * THIS METHOD IS USED TO DELETE A SINGLE EMPLOYEE RECORD FROM DATA BASE BY PASSING EMPLOYEE ID.
	 * @param id
	 * @return INT
	 */
	public int deleteRow(int id);
}
