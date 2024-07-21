package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Employee;
import com.nail_art.appointment_book.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/test/{id}")
    public Employee findEmployeeById(@PathVariable int id) throws Exception {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return employee;
        }
        throw new ClassNotFoundException("Employee not found");
    }

    @GetMapping("/test")
    public List<Employee> findAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();

        return employees;
    }
}
