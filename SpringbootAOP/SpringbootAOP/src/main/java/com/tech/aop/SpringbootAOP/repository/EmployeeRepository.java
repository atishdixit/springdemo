package com.tech.aop.SpringbootAOP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.aop.SpringbootAOP.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long > {

}

