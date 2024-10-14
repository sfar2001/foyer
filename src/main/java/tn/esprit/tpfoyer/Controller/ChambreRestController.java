package tn.esprit.tpfoyer.Controller;
import tn.esprit.tpfoyer.services.ChamberServ;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chamber;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    ChamberServ chambreService;
    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chamber> getChambres() {
        List<Chamber> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }
    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chamber retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chamber chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chamber addChambre(@RequestBody Chamber c) {
        Chamber chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chamber modifyChambre(@RequestBody Chamber c) {
        Chamber chambre = chambreService.modifyChambre(c);
        return chambre;
    }
}
