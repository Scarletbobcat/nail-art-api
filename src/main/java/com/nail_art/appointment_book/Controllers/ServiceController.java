package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Service;
import com.nail_art.appointment_book.Services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {
    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping("/Services/{id}")
    public Service getServiceById(@PathVariable int id) throws Exception {
        Service service = serviceService.getServiceById(id);
        if (service != null) {
            return service;
        }
        throw new ClassNotFoundException("Service not found");
    }

    @GetMapping("/Services")
    public List<Service> getAllServices() {
        return serviceService.getAll();
    }

    @PostMapping("Services/Create")
    public void createService(@RequestBody Service service){
        serviceService.createService(service);
    }

    @DeleteMapping("Services/Delete/{id}")
    public void deleteService(@PathVariable int id){
        serviceService.deleteServiceById(id);
    }

}
