package com.nail_art.appointment_book.Repositories;

import com.nail_art.appointment_book.Models.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends MongoRepository<Service, String> {
}
