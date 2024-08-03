package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Employee;
import com.nail_art.appointment_book.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("Employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
}
