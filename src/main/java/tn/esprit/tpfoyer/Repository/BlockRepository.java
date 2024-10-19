package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Block;

public interface BlockRepository extends JpaRepository<Block, Long> {
}
