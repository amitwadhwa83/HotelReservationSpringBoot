package com.example.demo.service;

import com.example.demo.domain.Reservation;
import com.example.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    // Retrieve all rows from table and populate list with objects
    public List getAllReservations() {

        List reservations = new ArrayList<>();
        repository.findAll().forEach(reservations::add);

        return reservations;
    }

    // Retrieves one row from table based on given id
    public Reservation getReservation(Long id) {
        return repository.findById(id).orElse(new Reservation());

    }

    // Inserts row into table
    public void addReservation(Reservation reservation) {
        repository.save(reservation);
    }

    // Updates row in table
    public void updateReservation(Long id, Reservation reservation) {
        repository.save(reservation);
    }

    // Removes row from table
    public void deleteReservation(Long id) {
        repository.deleteById(id);
    }
}
