package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Employee;
import com.nail_art.appointment_book.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/Employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) throws Exception {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return employee;
        }
        throw new ClassNotFoundException("Employee not found");
    }

    @GetMapping("/Employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();

        return employees;
    }

    @PostMapping("Employees/Create")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }
}
