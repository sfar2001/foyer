package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface UniversiteServ { public List<Universite> retrieveAllUniversite();
    public Universite retrieveUniversite(Long unervisiteId);
    public Universite addUniversite(Universite R);
    public void removeUniversite(Long unervisiteId);
    public Universite modifyUniversite(Universite unervisiteId);
}
