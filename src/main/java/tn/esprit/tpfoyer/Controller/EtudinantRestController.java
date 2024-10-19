package tn.esprit.tpfoyer.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.services.EtudiantServ;
import lombok.AllArgsConstructor;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudinantRestController {
   EtudiantServ etudiantServ;
   @GetMapping("/retrive-all-etudiant")
    public List<Etudiant> retriveAllEtudiant() {
       List<Etudiant> listEtudiant=etudiantServ.retrieveAllEtudiant();
       return listEtudiant;
   }
   @GetMapping("/retrive-etudiant/{etudiant-id}")
   public Etudiant retriveEtudiantById(@PathVariable("etudiant-id") Long etId) {
      Etudiant etudiant=etudiantServ.retrieveEtudiant(etId);
      return etudiant;
   }
   @PostMapping("/add-etudiant")
   public Etudiant addEtudiant(@RequestBody Etudiant et) {
      Etudiant etudiant=etudiantServ.addEtudiant(et);
      return etudiant;
   }
   @DeleteMapping("/delete-etudiant/{etudiant-id}")
   public void deleteEtudiant(@PathVariable("etudiant-id") Long etId) {
      etudiantServ.removeEtudiant(etId);
   }
   @PutMapping("/modify-etudiant")
   public Etudiant modifyEtudiant(@RequestBody Etudiant et) {
      Etudiant etudiant=etudiantServ.modifyEtudiant(et);
      return etudiant;
   }



}
