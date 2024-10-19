package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface ResrvationServ {
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation R);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservationId);
}
