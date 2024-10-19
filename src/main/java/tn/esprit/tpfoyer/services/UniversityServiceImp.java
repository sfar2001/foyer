package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.UniversiteRepository;
import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;
@Service

public class UniversityServiceImp implements UniversiteServ{
    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long unervisiteId) {
        return universiteRepository.findById(unervisiteId).get();
    }

    @Override
    public Universite addUniversite(Universite R) {
        return universiteRepository.save(R);
    }

    @Override
    public void removeUniversite(Long unervisiteId) {
universiteRepository.deleteById(unervisiteId);
    }

    @Override
    public Universite modifyUniversite(Universite unervisiteId) {
        return universiteRepository.save(unervisiteId);
    }
}
