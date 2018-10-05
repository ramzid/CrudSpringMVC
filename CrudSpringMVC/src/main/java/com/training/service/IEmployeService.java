package com.training.service;

import java.util.List;

import com.persistance.model.Employee;

public interface IEmployeService {
public void add(Employee emp);
public void delete(Employee emp);
public List<Employee> findAll();
public Employee update(Employee emp);
public Employee findById(int employeeId);
}
