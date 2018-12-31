 package jon.mod.init;

import java.util.ArrayList;
import java.util.List;

import jon.mod.objects.blocks.BlockBase;
import jon.mod.objects.blocks.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>(); 
	
	public static final Block BLOCK_DARKSTEEL = new BlockBase("block_darksteel", Material.IRON);

	//public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	//public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	
	
	//public static final Block PLANKS = new BlockPlank("planks");
	//public static final Block LOG = new BlockLogs("log");
	//public static final Block LEAVES = new BlockLeaf("leaves");
	//public static final Block SAPLING = new BlockSaplings("sapling");

}
