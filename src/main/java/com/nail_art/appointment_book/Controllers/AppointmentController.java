package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.Appointment;
import com.nail_art.appointment_book.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping("Appointments")
    public List<Appointment> getAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("Appointments/{id}")
    public Optional<Appointment> getAppointment(@PathVariable int id) {
        return appointmentService.getAppointmentById(id);
    }

    @GetMapping("Appointments/date/{date}")
    public List<Appointment> getAppointmentsByDate(@PathVariable String date) {
        return appointmentService.getAppointmentsByDate(date);
    }

    @PostMapping("Appointments/Create")
    public void createAppointment(@RequestBody Appointment appointment) {
        appointmentService.createAppointment(appointment);
    }
}
