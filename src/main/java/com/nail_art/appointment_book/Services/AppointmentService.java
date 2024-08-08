package com.nail_art.appointment_book.Services;

import com.nail_art.appointment_book.Models.Appointment;
import com.nail_art.appointment_book.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> getAppointmentById(int id) {
        return appointmentRepository.findById(id);
    }

    public List<Appointment> getAppointmentsByDate(String date) {
        return appointmentRepository.findByDate(date);
    }

    public void createAppointment(Appointment appointment) {
        appointment.setId((int) appointmentRepository.count() + 1);
        appointmentRepository.save(appointment);
    }
}
