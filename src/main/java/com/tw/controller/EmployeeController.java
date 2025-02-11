package com.tw.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tw.entity.Employees;
import com.tw.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	//EmployeeService e1=new EmployeeServiceImpl();
	
	@Autowired
	private EmployeeService e1;

	@PostMapping("/save")
	public String save(@RequestBody  Employees data) {
		
		String res=e1.saveEmployee(data);
		
		return res;
	}
	
	@GetMapping("/emplist")
	public List<Employees> listofEmployee() {
		
		List<Employees> l=	e1.listofEmployee();
		
		return l;
	}
	
	@GetMapping("/empbyid")
	public Employees getOneEmployee(@RequestParam("emp_id") Long id) {
		
		Employees res= e1.getOneEmployee(id);
		
		return res;
	}
}
