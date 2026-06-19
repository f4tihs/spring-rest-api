package com.quattca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quattca.model.Employee;
import com.quattca.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        // Insert future controls here
        employeeRepository.getAllEmployeeList();
        return null;
    }
}
