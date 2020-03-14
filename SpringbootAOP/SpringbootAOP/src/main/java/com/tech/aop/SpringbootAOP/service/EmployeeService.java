package com.tech.aop.SpringbootAOP.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.tech.aop.SpringbootAOP.client.SpringRestClient;
import com.tech.aop.SpringbootAOP.exception.ResourceNotFoundException;
import com.tech.aop.SpringbootAOP.model.Employee;
import com.tech.aop.SpringbootAOP.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
	@Autowired
    private EmployeeRepository employeeRepository;

    public List < Employee > getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional < Employee > getEmployeeById(Long employeeId)
    throws ResourceNotFoundException {
        return employeeRepository.findById(employeeId);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long employeeId,
        Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(()-> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return updatedEmployee;
    }

    public Map < String, Boolean > deleteEmployee(Long employeeId)
    throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(()-> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
       
}