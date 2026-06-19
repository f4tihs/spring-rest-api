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
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){
        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }

    public Employee saveEmployee(Employee newEmployee){
        return employeeRepository.saveEmployee(newEmployee);
    }

    public boolean deleteEmployee(String id){
        return employeeRepository.deleteEmployee(id);
    }
}
