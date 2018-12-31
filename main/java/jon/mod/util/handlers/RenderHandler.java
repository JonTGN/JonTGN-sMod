package jon.mod.util.handlers;

import jon.mod.entity.EntityZombieKnight;
import jon.mod.entity.render.RenderZombieKnight;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieKnight.class, new IRenderFactory<EntityZombieKnight>()
		{
			@Override
			public Render<? super EntityZombieKnight> createRenderFor(RenderManager manager)
			{
				return new RenderZombieKnight(manager);
			}
		});
	}
}
