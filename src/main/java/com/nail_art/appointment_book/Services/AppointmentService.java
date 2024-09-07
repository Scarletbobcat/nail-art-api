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

    public void editAppointment(Appointment appointment) {
        Optional<Appointment> tempAppointment = getAppointmentById(appointment.getId());
        if (tempAppointment.isPresent()) {
            tempAppointment.get().setServices(appointment.getServices());
            tempAppointment.get().setDate(appointment.getDate());
            tempAppointment.get().setName(appointment.getName());
            tempAppointment.get().setEmployeeId(appointment.getEmployeeId());
            tempAppointment.get().setStartTime(appointment.getStartTime());
            tempAppointment.get().setEndTime(appointment.getEndTime());
            tempAppointment.get().setPhoneNumber(appointment.getPhoneNumber());
            appointmentRepository.save(tempAppointment.get());
        }
    }

    public void deleteAppointment(Appointment appointment) {
        Optional<Appointment> tempAppointment = getAppointmentById(appointment.getId());
        if (tempAppointment.isPresent()) {
            appointmentRepository.delete(tempAppointment.get());
        } else {
            throw new Error("Appointment not found");
        }
    }

    public List<Appointment> getAppointmentsByPhoneNumber(String phoneNumber) {
        return appointmentRepository.findByPhoneNumber(phoneNumber);
    }
}
