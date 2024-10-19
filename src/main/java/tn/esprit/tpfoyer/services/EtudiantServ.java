package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface EtudiantServ {
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant E);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
