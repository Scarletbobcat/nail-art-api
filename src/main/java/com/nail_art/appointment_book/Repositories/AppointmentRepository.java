package com.nail_art.appointment_book.Repositories;

import com.nail_art.appointment_book.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    public List<Appointment> findByDate(String date);
}
