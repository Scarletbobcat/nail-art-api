package com.nail_art.appointment_book.services;

import com.nail_art.appointment_book.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<com.nail_art.appointment_book.entities.Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public com.nail_art.appointment_book.entities.Service createService(com.nail_art.appointment_book.entities.Service service) {
        service.setId((int) serviceRepository.count() + 1);
        return serviceRepository.save(service);
    }
}
