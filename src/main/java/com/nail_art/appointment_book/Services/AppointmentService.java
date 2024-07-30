package com.nail_art.appointment_book.Services;

import com.nail_art.appointment_book.Models.Appointment;
import com.nail_art.appointment_book.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAppointmentsByDate(String date) {
        return appointmentRepository.findByDate(date);
    }

    public Appointment getAppointmentById(int id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public List<Appointment> getAllAppointments() {

        return appointmentRepository.findAll();
    }

    public void createAppointment(Appointment employee) {
        appointmentRepository.save(employee);
    }

    public void deleteAppointmentById(int id) {
        appointmentRepository.deleteById(id);
    }
}
