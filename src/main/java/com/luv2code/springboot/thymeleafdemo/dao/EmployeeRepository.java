package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
		//thats it
	
	public List<Employee> findAllByOrderByLastNameAsc(); 
	
	//for more info www.luv2code.com/query-methods
}
