package jon.mod.entity;

import jon.mod.util.handlers.SoundsHandler;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityZombieKnight extends EntityZombie
{
	public EntityZombieKnight(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.6F, 1.95F);
	}
	
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIZombieAttack(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(42.00D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(45.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3400000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.5D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4.5D);
	}
	
	
	protected void setEquipment()
    {
        //super.setEquipmentBasedOnDifficulty(difficulty);

        //this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));

    }
	
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata)
	{
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setEquipmentBasedOnDifficulty(difficulty);
		
		return livingdata;
	}
	
	@Override
	public float getEyeHeight()
    {
        float f = 1.74F;

        if (this.isChild())
        {
            f = (float)((double)f - 0.81D);
        }

        return f;
    }
	
	@Override
	protected SoundEvent getAmbientSound() 
	{
		return SoundsHandler.ENTITY_ZOMBIEKNIGHT_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source)
	{
		return SoundsHandler.ENTITY_ZOMBIEKNIGHT_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundsHandler.ENTITY_ZOMBIEKNIGHT_DEATH;
	}


}
