package com.nail_art.appointment_book.controllers;

import com.nail_art.appointment_book.entities.Appointment;
import com.nail_art.appointment_book.services.AppointmentService;
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

    @PutMapping("Appointments/Edit")
    public void editAppointment(@RequestBody Appointment appointment) {
        appointmentService.editAppointment(appointment);
    }

    @DeleteMapping("Appointments/Delete")
    public void deleteAppointment(@RequestBody Appointment appointment) {
        appointmentService.deleteAppointment(appointment);
    }

    @GetMapping("Appointments/Search/{phoneNumber}")
    public List<Appointment> getAppointments(@PathVariable String phoneNumber) {
       List<Appointment> appointments = appointmentService.getAppointmentsByPhoneNumber(phoneNumber);
       return appointments;
    }
}
