package com.nail_art.appointment_book.Services;

import com.nail_art.appointment_book.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<com.nail_art.appointment_book.Models.Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public void createService(com.nail_art.appointment_book.Models.Service service) {
        service.setId((int) serviceRepository.count() + 1);
        serviceRepository.save(service);
    }
}
