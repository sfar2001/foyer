package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Chamber;

import java.util.List;

public interface ChamberRepository extends JpaRepository<Chamber, Long> {
}
