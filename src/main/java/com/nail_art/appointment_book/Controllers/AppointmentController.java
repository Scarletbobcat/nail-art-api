package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Appointment;
import com.nail_art.appointment_book.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/Appointments/{id}")
    public Appointment getApppointmentById(@PathVariable int id) throws Exception {
        Appointment appointment = appointmentService.getAppointmentById(id);
        if (appointment != null) {
            return appointment;
        }
        throw new ClassNotFoundException("Appointment not found");
    }

    @GetMapping("/Appointments")
    public List<Appointment> getAllServices() {
        return appointmentService.getAllAppointments();
    }

    @PostMapping("Appointments/Create")
    public void createService(@RequestBody Appointment appointment){
        appointmentService.createAppointment(appointment);
    }

    @DeleteMapping("Appointments/Delete/{id}")
    public void deleteService(@PathVariable int id){
        appointmentService.deleteAppointmentById(id);
    }

}
