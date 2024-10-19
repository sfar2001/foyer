package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.EtudiantRepository;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
@Service
public class EtudiantServiceImp implements EtudiantServ{
    @Autowired

    EtudiantRepository etudiantRepository;
    @Override

    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }
    @Override

    public Etudiant retrieveEtudiant(Long etudiantId) {
       return etudiantRepository.findById(etudiantId).get();
    }
    @Override

    public Etudiant addEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }
    @Override

    public void removeEtudiant(Long etudiantId) {
         etudiantRepository.deleteById(etudiantId);
    }
    @Override

    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
