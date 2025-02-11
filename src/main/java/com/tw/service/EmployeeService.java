package com.tw.service;

import java.util.List;

import com.tw.entity.Employees;

public interface EmployeeService {
  
	public String saveEmployee(Employees data);
	
	public List<Employees> listofEmployee();
	
	public Employees getOneEmployee(Long id);

	public String deleteById(Long id);
}
