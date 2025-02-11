package com.tw.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tw.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

}
