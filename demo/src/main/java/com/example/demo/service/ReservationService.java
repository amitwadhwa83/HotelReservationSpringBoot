package com.example.demo.service;

import com.example.demo.domain.Reservation;

import java.util.List;

public interface ReservationService {

    public List getAllReservations();

    public Reservation getReservation(Long id);

    public void addReservation(Reservation reservation);

    public void updateReservation(Long id, Reservation reservation);

    public void deleteReservation(Long id);
}
