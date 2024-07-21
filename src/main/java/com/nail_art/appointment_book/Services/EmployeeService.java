package com.nail_art.appointment_book.Services;

import com.nail_art.appointment_book.Models.Employee;
import com.nail_art.appointment_book.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        return employee.orElse(null);
    }
}
