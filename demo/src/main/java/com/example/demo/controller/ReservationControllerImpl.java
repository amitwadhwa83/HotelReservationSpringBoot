package com.example.demo.controller;

import com.example.demo.domain.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class ReservationControllerImpl implements ReservationController {

    @Autowired
    private ReservationService service;

    // ------------ Retrieve all reservations ------------
    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    public List getAllReservations() {

        return service.getAllReservations();

    }

    // ------------ Retrieve a reservation ------------
    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable Long id) {
        return service.getReservation(id);
    }

    // ------------ Create a reservation ------------
    @RequestMapping(value = "/reservations", method = RequestMethod.POST)
    public void addReservation(@RequestBody Reservation reservation) {
        service.addReservation(reservation);

    }

    // ------------ Update a reservation ------------
    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.PUT)
    public void updateReservation(@RequestBody Reservation reservation, @PathVariable Long id) {
        service.updateReservation(id, reservation);
    }

    // ------------ Delete a reservation ------------
    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable Long id) {
        service.deleteReservation(id);
    }
}
