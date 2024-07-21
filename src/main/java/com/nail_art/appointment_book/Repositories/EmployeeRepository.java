package com.nail_art.appointment_book.Repositories;

import com.nail_art.appointment_book.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Custom queries go here if needed
}
