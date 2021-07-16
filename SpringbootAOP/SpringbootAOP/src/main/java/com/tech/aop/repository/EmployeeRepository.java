package com.tech.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.aop.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long > {

}

