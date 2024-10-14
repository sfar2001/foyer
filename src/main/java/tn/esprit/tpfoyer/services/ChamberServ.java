package tn.esprit.tpfoyer.services;
import tn.esprit.tpfoyer.entity.Chamber;
import java.util.List;
public interface ChamberServ {
    public List<Chamber> retrieveAllChambres();
    public Chamber retrieveChambre(Long chambreId);
    public Chamber addChambre(Chamber c);
    public void removeChambre(Long chambreId);
    public Chamber modifyChambre(Chamber chambre);
}
