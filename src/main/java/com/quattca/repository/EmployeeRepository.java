package com.quattca.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class EmployeeRepository {

    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeeList(){
        return null;
    }
}
