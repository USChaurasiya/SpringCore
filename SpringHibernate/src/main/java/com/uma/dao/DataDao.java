package com.uma.dao;

import java.util.List;

import com.uma.domain.Employee;

public interface DataDao {
	public int insertRow(Employee employee);

	 public List getList();

	 public Employee getRowById(int id);

	 public int updateRow(Employee employee);

	 public int deleteRow(int id);
}
