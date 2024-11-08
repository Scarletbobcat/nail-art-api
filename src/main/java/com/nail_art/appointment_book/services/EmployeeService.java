package com.nail_art.appointment_book.services;

import com.nail_art.appointment_book.entities.Employee;
import com.nail_art.appointment_book.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        System.out.println(employees);

        return employees;
    }

    public Employee createEmployee(Employee employee) {
        employee.setId((int) employeeRepository.count() + 1);
        return employeeRepository.save(employee);
    }
}
