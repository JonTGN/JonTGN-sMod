package jon.mod.entity.render;

import jon.mod.entity.EntityZombieKnight;
import jon.mod.entity.model.ModelZombieKnight;
import jon.mod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerElytra;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerVillagerArmor;
import net.minecraft.util.ResourceLocation;

public class RenderZombieKnight extends RenderLiving<EntityZombieKnight>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/zombieknight.png");
	
	
	public RenderZombieKnight(RenderManager manager)
	{
		super(manager, new ModelZombieKnight(), 0.5F);
		 //this.addLayer(new LayerElytra(this)); 
		 //this.addLayer(new LayerHeldItem(this)); 
		 //this.addLayer(new LayerVillagerArmor(this)); 
		 //this.addLayer(new LayerArmorBase(this)); ENTITIES PRT2 BOTTOM COMMENT
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityZombieKnight entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityZombieKnight entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
