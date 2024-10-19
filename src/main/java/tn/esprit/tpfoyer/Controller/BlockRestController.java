package tn.esprit.tpfoyer.Controller;
import tn.esprit.tpfoyer.services.BlockServ;
import tn.esprit.tpfoyer.services.BlockServiceImp;
import tn.esprit.tpfoyer.services.ChamberServ;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chamber;
import tn.esprit.tpfoyer.entity.Block;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/block")
public class BlockRestController {
    BlockServ blockService;
    @GetMapping("/retrive-all-blocks")
    public List<Block> getBlock(){
        List<Block> listBlock=blockService.retrieveAllBlock();
        return listBlock;
    }
    @GetMapping("/retrive-block/{block-id}")
    public Block retriveBlock(@PathVariable("block-id") Long BlockId ){
        Block block= blockService.retrieveBlock(BlockId);
        return block;

    }
    @PostMapping("/add-block")
    public Block addBlock(@RequestBody Block b){
        Block block=blockService.addBlock(b);
        return block;
    }
    @DeleteMapping("/remove-block/{block-id}")
    public void removeBlock(@PathVariable("block-id") Long BlockId){
        blockService.removeBlock(BlockId);
    }
    @PutMapping("/modift-chamber")
    public Block modifyChamber(@RequestBody Block b){
        Block block=blockService.modifyChambre(b);
        return block;
    }




}
