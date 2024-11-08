package com.nail_art.appointment_book.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.nail_art.appointment_book.entities.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
