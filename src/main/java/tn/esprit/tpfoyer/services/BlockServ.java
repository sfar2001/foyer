package tn.esprit.tpfoyer.services;
import tn.esprit.tpfoyer.entity.Block;

import java.util.List;

public interface BlockServ {
    public List<Block> retrieveAllBlock();
    public Block retrieveBlock(Long blockId);
    public Block addBlock(Block b);
    public void removeBlock(Long blockId);
    public Block modifyChambre(Block block);
}
