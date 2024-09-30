package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date anneUniversitaire;
    private boolean isValid;
    @ManyToOne(cascade = CascadeType.ALL)
    private Reservation reservation;
    @ManyToMany(mappedBy = "reservation",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
