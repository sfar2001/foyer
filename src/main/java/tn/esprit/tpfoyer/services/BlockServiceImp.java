package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repository.BlockRepository;
import tn.esprit.tpfoyer.entity.Block;
import java.util.List;

@Service
@AllArgsConstructor
public class BlockServiceImp implements BlockServ {
    BlockRepository blockRepository;

    public List<Block> retrieveAllBlock() {
        return blockRepository.findAll();
    }
    public Block retrieveBlock(Long blockId) {
        return blockRepository.findById(blockId).get();

    }
    public Block addBlock(Block b) {
        return blockRepository.save(b);

    }

    public void removeBlock(Long blockId) {
        blockRepository.deleteById(blockId);

    }

    public Block modifyChambre(Block block) {
        return blockRepository.save(block);
    }


}

