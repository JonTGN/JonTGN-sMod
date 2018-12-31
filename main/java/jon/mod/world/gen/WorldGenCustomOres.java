package jon.mod.world.gen;

import java.util.Random;

import jon.mod.init.BlockInit;
import jon.mod.objects.blocks.BlockOres;
import jon.mod.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_darkstone; //add comma and next ore you want here
	
	public WorldGenCustomOres()
	{
		ore_overworld_darkstone = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.DARKSTONE), 5, BlockMatcher.forBlock(Blocks.STONE));
		//ore_nether_darkstone = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.DARKSTONE), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		//ore_end_darkstone = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.DARKSTONE), 8, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		/* NETHER CASE
		case -1:
			
			runGenerator(ore_nether_darkstone, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
		*/
		
		case 0: //overworld
			runGenerator(ore_overworld_darkstone, world, random, chunkX, chunkZ, 20, 0, 50);
			
			break;
			
		/* END CASE
		case 1:
		
			runGenerator(ore_end_darkstone, world, random, chunkX, chunkZ, 50, 0, 256);
		 */
	
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore genorated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
			
		}
	}
}
