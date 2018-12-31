package jon.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;


/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelZombieKnight extends ModelBase {
    public ModelRenderer right_arm;
    public ModelRenderer right_leg;
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer left_arm;
    public ModelRenderer left_leg;
    public ModelRenderer neck;
    public ModelRenderer feather2;
    public ModelRenderer feather3;
    public ModelRenderer arrow;
    public ModelRenderer feather;
    public ModelRenderer feather4;

    public ModelZombieKnight() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.feather3 = new ModelRenderer(this, 0, 0);
        this.feather3.setRotationPoint(1.0F, 5.2F, -9.0F);
        this.feather3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(feather3, 0.0F, -0.22759093446006054F, -1.5707963267948966F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.left_leg = new ModelRenderer(this, 0, 16);
        this.left_leg.mirror = true;
        this.left_leg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.left_leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.right_leg = new ModelRenderer(this, 0, 16);
        this.right_leg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.right_leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.neck = new ModelRenderer(this, 32, 0);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.feather4 = new ModelRenderer(this, 0, 0);
        this.feather4.setRotationPoint(0.2F, 5.1F, -9.0F);
        this.feather4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(feather4, -0.16580627893946132F, 0.0F, 0.0F);
        this.right_arm = new ModelRenderer(this, 40, 16);
        this.right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.right_arm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(right_arm, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
        this.feather2 = new ModelRenderer(this, 0, 0);
        this.feather2.setRotationPoint(0.0F, 4.6F, -9.0F);
        this.feather2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(feather2, 0.0F, 0.22759093446006054F, 1.5707963267948966F);
        this.left_arm = new ModelRenderer(this, 40, 16);
        this.left_arm.mirror = true;
        this.left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.left_arm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(left_arm, -1.3962634015954636F, 0.10000736613927509F, -0.10000736613927509F);
        this.arrow = new ModelRenderer(this, 0, 0);
        this.arrow.setRotationPoint(0.0F, 4.3F, -9.0F);
        this.arrow.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(arrow, -0.15707963267948966F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.feather = new ModelRenderer(this, 0, 0);
        this.feather.setRotationPoint(0.2F, 3.4F, -8.7F);
        this.feather.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(feather, -0.16580627893946132F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.feather3.offsetX, this.feather3.offsetY, this.feather3.offsetZ);
        GlStateManager.translate(this.feather3.rotationPointX * f5, this.feather3.rotationPointY * f5, this.feather3.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.5D, 1.0D);
        GlStateManager.translate(-this.feather3.offsetX, -this.feather3.offsetY, -this.feather3.offsetZ);
        GlStateManager.translate(-this.feather3.rotationPointX * f5, -this.feather3.rotationPointY * f5, -this.feather3.rotationPointZ * f5);
        this.feather3.render(f5);
        GlStateManager.popMatrix();
        this.body.render(f5);
        this.left_leg.render(f5);
        this.right_leg.render(f5);
        this.neck.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.feather4.offsetX, this.feather4.offsetY, this.feather4.offsetZ);
        GlStateManager.translate(this.feather4.rotationPointX * f5, this.feather4.rotationPointY * f5, this.feather4.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 1.0D, 1.0D);
        GlStateManager.translate(-this.feather4.offsetX, -this.feather4.offsetY, -this.feather4.offsetZ);
        GlStateManager.translate(-this.feather4.rotationPointX * f5, -this.feather4.rotationPointY * f5, -this.feather4.rotationPointZ * f5);
        this.feather4.render(f5);
        GlStateManager.popMatrix();
        this.right_arm.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.feather2.offsetX, this.feather2.offsetY, this.feather2.offsetZ);
        GlStateManager.translate(this.feather2.rotationPointX * f5, this.feather2.rotationPointY * f5, this.feather2.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.5D, 1.0D);
        GlStateManager.translate(-this.feather2.offsetX, -this.feather2.offsetY, -this.feather2.offsetZ);
        GlStateManager.translate(-this.feather2.rotationPointX * f5, -this.feather2.rotationPointY * f5, -this.feather2.rotationPointZ * f5);
        this.feather2.render(f5);
        GlStateManager.popMatrix();
        this.left_arm.render(f5);
        this.arrow.render(f5);
        this.head.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.feather.offsetX, this.feather.offsetY, this.feather.offsetZ);
        GlStateManager.translate(this.feather.rotationPointX * f5, this.feather.rotationPointY * f5, this.feather.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 1.0D, 1.0D);
        GlStateManager.translate(-this.feather.offsetX, -this.feather.offsetY, -this.feather.offsetZ);
        GlStateManager.translate(-this.feather.rotationPointX * f5, -this.feather.rotationPointY * f5, -this.feather.rotationPointZ * f5);
        this.feather.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	//Arm Swing
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        boolean flag = entityIn instanceof EntityZombie && ((EntityZombie)entityIn).isArmsRaised();
        float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
        float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
        this.right_arm.rotateAngleZ = 0.0F;
        this.left_arm.rotateAngleZ = 0.0F;
        this.right_arm.rotateAngleY = -(0.1F - f * 0.6F);
        this.left_arm.rotateAngleY = 0.1F - f * 0.6F;
        float f2 = -(float)Math.PI / (flag ? 1.5F : 2.25F);
        this.right_arm.rotateAngleX = f2;
        this.left_arm.rotateAngleX = f2;
        this.right_arm.rotateAngleX += f * 1.2F - f1 * 0.4F;
        this.left_arm.rotateAngleX += f * 1.2F - f1 * 0.4F;
        this.right_arm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.left_arm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.right_arm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.left_arm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    	

    	//this.head.rotateAngleY = netHeadYaw * 0.017453292F;
    	//this.head.rotateAngleX = headPitch * 0.017453292F;
    }
}
