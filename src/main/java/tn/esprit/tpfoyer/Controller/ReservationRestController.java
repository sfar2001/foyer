package tn.esprit.tpfoyer.Controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.services.ResrvationServ;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    ResrvationServ resrvationServ;
    @GetMapping("/retrive-all-reservation")
    public List<Reservation> retriveAllReservation() {
        List<Reservation> reservationList=resrvationServ.retrieveAllReservation();
        return reservationList;
    }
    @GetMapping("/retrive-reservation/{reservation-id}")
    public Reservation retriveReservation(@PathVariable Long reservationId) {
        Reservation reservation=resrvationServ.retrieveReservation(reservationId);
        return reservation;
    }
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        resrvationServ.addReservation(reservation);
        return reservation;
    }

    @DeleteMapping("/remove-reservation/{id-reservation}")
    public void removeReservation(@PathVariable Long idReservation) {
        resrvationServ.removeReservation(idReservation);
    }
    @PostMapping("/modify-reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        Reservation reservation1=resrvationServ.modifyReservation(reservation);
        return reservation1;
    }

}
