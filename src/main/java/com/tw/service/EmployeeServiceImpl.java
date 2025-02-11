package com.tw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tw.entity.Employees;
import com.tw.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public String saveEmployee(Employees data) {
		
		//System.err.println(data);
		
		if(data.getId() > 0) {
			
			Employees	dbobj=repo.getById(data.getId());
			dbobj.setAge(data.getAge());
			dbobj.setName(data.getName());
			
			repo.save(dbobj);
			
			return "update success from service!";
		}else {
			Employees newobj=new Employees();
			newobj.setAge(data.getAge());
			newobj.setName(data.getName());
			
			repo.save(newobj);
			return "save success from service!";
		}
		
	}

	@Override
	public List<Employees> listofEmployee() {
		
		List<Employees> l=	repo.findAll();
		
		return l;
	}

	@Override
	public Employees getOneEmployee(Long id) {
		
		Optional<Employees> byId = repo.findById(id);
		
		Employees emp=	byId.get();
		
		return emp;
	}

	@Override
	public String deleteById(Long id) {
		repo.deleteById(id);
		return "deleted success!";
	}

}
