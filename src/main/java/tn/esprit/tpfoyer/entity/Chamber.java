package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chamber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChamber;
    private String numeroChamber;
    @Enumerated(EnumType.STRING)
    private TypeChamber typeC;
    @ManyToOne(cascade = CascadeType.ALL)
    Reservation reservation;
    @ManyToOne
    Block block;


}
