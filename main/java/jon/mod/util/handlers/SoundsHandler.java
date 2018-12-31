package jon.mod.util.handlers;

import jon.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_ZOMBIEKNIGHT_AMBIENT, ENTITY_ZOMBIEKNIGHT_HURT, ENTITY_ZOMBIEKNIGHT_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_ZOMBIEKNIGHT_AMBIENT = registerSound("entity.zombieknight.ambient");
		ENTITY_ZOMBIEKNIGHT_HURT = registerSound("entity.zombieknight.hurt");
		ENTITY_ZOMBIEKNIGHT_DEATH = registerSound("entity.zombieknight.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
