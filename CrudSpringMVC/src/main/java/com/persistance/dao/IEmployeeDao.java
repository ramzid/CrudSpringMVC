package com.persistance.dao;
import java.util.List;

import com.persistance.model.Employee;

public interface IEmployeeDao {
	

	public void add(Employee emp);
	public List<Employee> findAll();
	public void delete(Employee emp);
	public Employee update(Employee emp);
	public Employee findById(int id);
	}

