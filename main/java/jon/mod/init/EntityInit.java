package jon.mod.init;

import java.util.HashSet;
import java.util.Set;

import jon.mod.Main;
import jon.mod.entity.EntityZombieKnight;
import jon.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("zombie_knight", EntityZombieKnight.class, Reference.ENTITY_ZOMBIEKNIGHT, 50, 5701622, 8518); 
		//range (50) is how many blocks away can see player 1st & 2nd # is egg color
		addSpawns();
	}
	
	public void giveArmor(EntityJoinWorldEvent event)
	{
		if (!(event.getEntity() instanceof EntityZombieKnight))
		{
			return;
		}
		
		EntityZombieKnight zombie = (EntityZombieKnight) event.getEntity();
		//this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
		//zombie.setCurrentItemOrArmor(0, new ItemStack(Items.DIAMOND_AXE));
	}
	
	//private void setItemStackToSlot(EntityEquipmentSlot mainhand, ItemStack itemStack) {
		// TODO Auto-generated method stub
		
	//}

	private static void addSpawns() 
	{

		Set<Biome> validBiomes = new HashSet<>();

		validBiomes.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
		validBiomes.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
		validBiomes.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS));
		validBiomes.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP));
		validBiomes.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.HOT));
		
		
		validBiomes.removeAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.NETHER));
		validBiomes.removeAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.END));

		EntityRegistry.addSpawn(EntityZombieKnight.class, 40, 1, 1, EnumCreatureType.MONSTER, validBiomes.toArray(new Biome[validBiomes.size()]));
	

		
		

			
		
		
    } 
	 
	
	
	


	private static Biome[] getBiomes(final BiomeDictionary.Type type) 
	{ 
		return BiomeDictionary.getBiomes(type).toArray(new Biome[0]); 
    }
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ": " + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void copySpawns(final Class<? extends EntityLiving> classToAdd, final EnumCreatureType creatureTypeToAdd, final Class<? extends EntityLiving> classToCopy, final EnumCreatureType creatureTypeToCopy) 
	{ 
		for (final Biome biome : ForgeRegistries.BIOMES) 
			{ 
				biome.getSpawnableList(creatureTypeToCopy).stream() 
				.filter(entry -> entry.entityClass == classToCopy) 
				.findFirst() 
				.ifPresent(spawnListEntry -> 
				biome.getSpawnableList(creatureTypeToAdd).add(new Biome.SpawnListEntry(classToAdd, 
				spawnListEntry.itemWeight, spawnListEntry.minGroupCount, spawnListEntry.maxGroupCount)) ); 
			} 
	}
	
	
}
