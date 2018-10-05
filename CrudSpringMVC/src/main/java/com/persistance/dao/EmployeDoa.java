package com.persistance.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Employee;

@Repository
public class EmployeDoa implements IEmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
		// TODO Auto-generated method stub
		
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(emp);
	}

	
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().update(emp);
		 return emp;
	}

	
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return  (Employee) sessionFactory.getCurrentSession().get(Employee.class,id);
	}

}
