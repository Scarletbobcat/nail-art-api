package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Service;
import com.nail_art.appointment_book.Services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("Services")
    public List<Service> getServices() {
        return serviceService.getAllServices();
    }

    @PostMapping("Services/Create")
    public void createService(@RequestBody Service service) {
        serviceService.createService(service);
    }
}
