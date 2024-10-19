package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface FoyerServ {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer F);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
