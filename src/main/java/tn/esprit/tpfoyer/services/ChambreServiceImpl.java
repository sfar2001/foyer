package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.ChamberRepository;
import tn.esprit.tpfoyer.entity.Chamber;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements ChamberServ {
    ChamberRepository chambreRepository;
    public List<Chamber> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chamber retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    public Chamber addChambre(Chamber c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chamber modifyChambre(Chamber chambre) {
        return chambreRepository.save(chambre);
    }
}

