package com.nail_art.appointment_book.Services;

import com.nail_art.appointment_book.Models.Employee;
import com.nail_art.appointment_book.Repositories.EmployeeRepository;
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

    public void createEmployee(Employee employee) {
        employee.setId((int) employeeRepository.count() + 1);
        employeeRepository.save(employee);
    }
}
