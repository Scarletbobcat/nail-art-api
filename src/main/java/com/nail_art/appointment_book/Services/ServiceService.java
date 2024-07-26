package com.nail_art.appointment_book.Services;

import com.nail_art.appointment_book.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public com.nail_art.appointment_book.Models.Service getServiceById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public List<com.nail_art.appointment_book.Models.Service> getAll() {
        return serviceRepository.findAll();
    }

    public void createService(com.nail_art.appointment_book.Models.Service service) {
        serviceRepository.save(service);
    }

    public void deleteServiceById(int id) {
        serviceRepository.deleteById(id);
    }
}
