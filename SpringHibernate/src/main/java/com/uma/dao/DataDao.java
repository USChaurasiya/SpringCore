package com.uma.dao;

import java.util.List;

import com.uma.domain.Employee;

/**
 * Interface Containing the method related to manipulation from data base.
 * @author um@.
 * 
 *
 */
public interface DataDao {
	/**
	 * To insert a Single record into Data Base .
	 * @param employee
	 * @return int 
	 */
	public int insertRow(Employee employee);

	 /**
	  * This method is used to fetch all Employee from Data Base.
	 * @return List<Employee>
	 */
	public List<Employee> getList();

	 /**
	  * To get a Particular Employee corresponding to the Employee Id.
	 * @param id(int)
	 * @return Employee DTO Type.
	 */
	public Employee getRowById(int id);

	 /**
	  * To update Employee Information .
	 * @param employee
	 * @return Int
	 */
	public int updateRow(Employee employee);

	 /**
	  * This method is used to delete the particular Employee info from data base using that corresponding Employee Id.
	 * @param id
	 * @return int
	 */
	public int deleteRow(int id);
	 
}
