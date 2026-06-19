package com.quattca.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.quattca.model.Employee;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("0", "Fatih", "Şahin"));
        employeeList.add(new Employee("1", "Yılmaz", "Yılmaz"));
        employeeList.add(new Employee("2", "Murat", "Tökeç"));
        employeeList.add(new Employee("3", "Fatih", "Uslu"));

        //TODO: If only database was a thing
        return employeeList;
    }
}
