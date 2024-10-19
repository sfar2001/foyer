package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.services.FoyerServ;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    FoyerServ foyerServ;
    @GetMapping("/retrive-all-foyes")
    public List<Foyer> retriveAllFoyers() {
        List<Foyer> foyerList=foyerServ.retrieveAllFoyer();
        return foyerList;
    }
    @GetMapping("/retrive-foyer/{foyer-id}")
    public Foyer retriveFoyerById(@PathVariable("foyer-id") Long foyerId) {
        Foyer foyer=foyerServ.retrieveFoyer(foyerId);
        return foyer;
    }
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        Foyer foyer1=foyerServ.addFoyer(foyer);
        return foyer1;
    }
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyerById(@PathVariable("foyer-id") Long foyerId) {
        foyerServ.removeFoyer(foyerId);
    }
    @PostMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) {
        Foyer foyer1=foyerServ.modifyFoyer(foyer);
        return foyer1;
    }
}
