package tn.esprit.tpfoyer.Controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.services.UniversiteServ;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    UniversiteServ universiteServ;
    @GetMapping("/retrive-all-universite")
    public List<Universite> retriveAllUniversite() {
        List<Universite> universiteList=universiteServ.retrieveAllUniversite();
        return universiteList;
    }
    @GetMapping("/retrive-universite/{id-universite}")
    public Universite retriveUniversite(@PathVariable Long iduniversite) {
        Universite universite=universiteServ.retrieveUniversite(iduniversite);
        return universite;
    }
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        universiteServ.addUniversite(universite);
        return universite;
    }
    @DeleteMapping("/remove-universite/{id-universite}")
    public void removeUniversite(@PathVariable Long iduniversite) {
        universiteServ.removeUniversite(iduniversite);
    }
    @PostMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite universite) {
        Universite universite1=universiteServ.addUniversite(universite);
        return universite1;
    }
}
