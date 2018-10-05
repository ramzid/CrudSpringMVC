package com.training.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IEmployeeDao;
import com.persistance.model.Employee;
@Service
@Transactional
public class EmployeService implements IEmployeService {
@Autowired
IEmployeeDao employeeDao;
		
	
	public void add(Employee emp) {
		employeeDao.add(emp);
		// TODO Auto-generated method stub

	}

	
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.delete(emp);
	}

	
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.update(emp);
	}

	
	public Employee findById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(employeeId);
	}

}