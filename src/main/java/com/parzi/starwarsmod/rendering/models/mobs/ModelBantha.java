package com.parzi.starwarsmod.rendering.models.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBantha extends ModelBase
{
	// fields
	ModelRenderer HornR1;
	ModelRenderer HornR2;
	ModelRenderer HornR3;
	ModelRenderer HornR4;
	ModelRenderer HornR5;
	ModelRenderer HornR6;
	ModelRenderer HornR7;
	ModelRenderer HornR8;
	ModelRenderer HornR9;
	ModelRenderer HornR10;
	ModelRenderer HornR11;
	ModelRenderer HornR12;
	ModelRenderer HornR13;
	ModelRenderer HornR14;
	ModelRenderer HornR15;
	ModelRenderer HornL1;
	ModelRenderer HornL2;
	ModelRenderer HornL3;
	ModelRenderer HornL4;
	ModelRenderer HornL5;
	ModelRenderer HornL6;
	ModelRenderer HornL7;
	ModelRenderer HornL8;
	ModelRenderer HornL9;
	ModelRenderer HornL10;
	ModelRenderer HornL11;
	ModelRenderer HornL12;
	ModelRenderer HornL13;
	ModelRenderer HornL14;
	ModelRenderer HornL15;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;
	ModelRenderer Tail5;
	ModelRenderer Tail6;
	ModelRenderer Tail7;
	ModelRenderer Tail8;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer LegRBack;
	ModelRenderer LegLBack;
	ModelRenderer LegRFront;
	ModelRenderer LegLFront;

	float animScale = 1.0F;

	public ModelBantha()
	{
		textureWidth = 128;
		textureHeight = 128;

		HornR1 = new ModelRenderer(this, 20, 86);
		HornR1.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR1.setRotationPoint(-10F, -6F, -13F);
		HornR1.setTextureSize(64, 32);
		HornR1.mirror = true;
		setRotation(HornR1, 0F, 0F, 0F);
		HornR2 = new ModelRenderer(this, 20, 94);
		HornR2.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR2.setRotationPoint(-12.5F, -8F, -12.5F);
		HornR2.setTextureSize(64, 32);
		HornR2.mirror = true;
		setRotation(HornR2, 0F, 0F, 0F);
		HornR3 = new ModelRenderer(this, 20, 102);
		HornR3.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR3.setRotationPoint(-14.5F, -10F, -11F);
		HornR3.setTextureSize(64, 32);
		HornR3.mirror = true;
		setRotation(HornR3, 0F, 0F, 0F);
		HornR4 = new ModelRenderer(this, 20, 110);
		HornR4.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR4.setRotationPoint(-15F, -9F, -8F);
		HornR4.setTextureSize(64, 32);
		HornR4.mirror = true;
		setRotation(HornR4, 0F, 0F, 0F);
		HornR5 = new ModelRenderer(this, 20, 118);
		HornR5.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR5.setRotationPoint(-15.5F, -8F, -5F);
		HornR5.setTextureSize(64, 32);
		HornR5.mirror = true;
		setRotation(HornR5, 0F, 0F, 0F);
		HornR6 = new ModelRenderer(this, 44, 56);
		HornR6.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR6.setRotationPoint(-16F, -7F, -2F);
		HornR6.setTextureSize(64, 32);
		HornR6.mirror = true;
		setRotation(HornR6, 0F, 0F, 0F);
		HornR7 = new ModelRenderer(this, 44, 64);
		HornR7.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR7.setRotationPoint(-16.5F, -5F, -1F);
		HornR7.setTextureSize(64, 32);
		HornR7.mirror = true;
		setRotation(HornR7, 0F, 0F, 0F);
		HornR8 = new ModelRenderer(this, 44, 72);
		HornR8.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR8.setRotationPoint(-16F, -2F, -2F);
		HornR8.setTextureSize(64, 32);
		HornR8.mirror = true;
		setRotation(HornR8, 0F, 0F, 0F);
		HornR9 = new ModelRenderer(this, 44, 80);
		HornR9.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR9.setRotationPoint(-15.5F, 1F, -4F);
		HornR9.setTextureSize(64, 32);
		HornR9.mirror = true;
		setRotation(HornR9, 0F, 0F, 0F);
		HornR10 = new ModelRenderer(this, 44, 88);
		HornR10.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR10.setRotationPoint(-15F, 3F, -7F);
		HornR10.setTextureSize(64, 32);
		HornR10.mirror = true;
		setRotation(HornR10, 0F, 0F, 0F);
		HornR11 = new ModelRenderer(this, 44, 96);
		HornR11.addBox(0F, 0F, 0F, 4, 4, 4);
		HornR11.setRotationPoint(-15.5F, 5F, -9.5F);
		HornR11.setTextureSize(64, 32);
		HornR11.mirror = true;
		setRotation(HornR11, 0F, 0F, 0F);
		HornR12 = new ModelRenderer(this, 44, 104);
		HornR12.addBox(0F, 0F, 0F, 3, 3, 3);
		HornR12.setRotationPoint(-16F, 4F, -11F);
		HornR12.setTextureSize(64, 32);
		HornR12.mirror = true;
		setRotation(HornR12, 0F, 0F, 0F);
		HornR13 = new ModelRenderer(this, 44, 110);
		HornR13.addBox(0F, 0F, 0F, 3, 3, 3);
		HornR13.setRotationPoint(-18F, 3F, -10.5F);
		HornR13.setTextureSize(64, 32);
		HornR13.mirror = true;
		setRotation(HornR13, 0F, 0F, 0F);
		HornR14 = new ModelRenderer(this, 44, 116);
		HornR14.addBox(0F, 0F, 0F, 2, 2, 2);
		HornR14.setRotationPoint(-18.5F, 2F, -9F);
		HornR14.setTextureSize(64, 32);
		HornR14.mirror = true;
		setRotation(HornR14, 0F, 0F, 0F);
		HornR15 = new ModelRenderer(this, 44, 120);
		HornR15.addBox(0F, 0F, 0F, 1, 1, 1);
		HornR15.setRotationPoint(-19F, 1.5F, -8F);
		HornR15.setTextureSize(64, 32);
		HornR15.mirror = true;
		setRotation(HornR15, 0F, 0F, 0F);
		HornL1 = new ModelRenderer(this, 20, 78);
		HornL1.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL1.setRotationPoint(6F, -6F, -13F);
		HornL1.setTextureSize(64, 32);
		HornL1.mirror = true;
		setRotation(HornL1, 0F, 0F, 0F);
		HornL2 = new ModelRenderer(this, 60, 56);
		HornL2.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL2.setRotationPoint(8.5F, -8F, -12.5F);
		HornL2.setTextureSize(64, 32);
		HornL2.mirror = true;
		setRotation(HornL2, 0F, 0F, 0F);
		HornL3 = new ModelRenderer(this, 60, 64);
		HornL3.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL3.setRotationPoint(10.5F, -10F, -11F);
		HornL3.setTextureSize(64, 32);
		HornL3.mirror = true;
		setRotation(HornL3, 0F, 0F, 0F);
		HornL4 = new ModelRenderer(this, 60, 72);
		HornL4.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL4.setRotationPoint(11F, -9F, -8F);
		HornL4.setTextureSize(64, 32);
		HornL4.mirror = true;
		setRotation(HornL4, 0F, 0F, 0F);
		HornL5 = new ModelRenderer(this, 60, 80);
		HornL5.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL5.setRotationPoint(11.5F, -8F, -5F);
		HornL5.setTextureSize(64, 32);
		HornL5.mirror = true;
		setRotation(HornL5, 0F, 0F, 0F);
		HornL6 = new ModelRenderer(this, 60, 88);
		HornL6.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL6.setRotationPoint(12F, -7F, -2F);
		HornL6.setTextureSize(64, 32);
		HornL6.mirror = true;
		setRotation(HornL6, 0F, 0F, 0F);
		HornL7 = new ModelRenderer(this, 60, 96);
		HornL7.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL7.setRotationPoint(12.5F, -5F, -1F);
		HornL7.setTextureSize(64, 32);
		HornL7.mirror = true;
		setRotation(HornL7, 0F, 0F, 0F);
		HornL8 = new ModelRenderer(this, 56, 104);
		HornL8.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL8.setRotationPoint(12F, -2F, -2F);
		HornL8.setTextureSize(64, 32);
		HornL8.mirror = true;
		setRotation(HornL8, 0F, 0F, 0F);
		HornL9 = new ModelRenderer(this, 56, 112);
		HornL9.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL9.setRotationPoint(11.5F, 1F, -4F);
		HornL9.setTextureSize(64, 32);
		HornL9.mirror = true;
		setRotation(HornL9, 0F, 0F, 0F);
		HornL10 = new ModelRenderer(this, 84, 0);
		HornL10.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL10.setRotationPoint(11F, 3F, -7F);
		HornL10.setTextureSize(64, 32);
		HornL10.mirror = true;
		setRotation(HornL10, 0F, 0F, 0F);
		HornL11 = new ModelRenderer(this, 84, 8);
		HornL11.addBox(0F, 0F, 0F, 4, 4, 4);
		HornL11.setRotationPoint(11.5F, 5F, -9.5F);
		HornL11.setTextureSize(64, 32);
		HornL11.mirror = true;
		setRotation(HornL11, 0F, 0F, 0F);
		HornL12 = new ModelRenderer(this, 84, 16);
		HornL12.addBox(0F, 0F, 0F, 3, 3, 3);
		HornL12.setRotationPoint(13F, 4F, -11F);
		HornL12.setTextureSize(64, 32);
		HornL12.mirror = true;
		setRotation(HornL12, 0F, 0F, 0F);
		HornL13 = new ModelRenderer(this, 84, 22);
		HornL13.addBox(0F, 0F, 0F, 3, 3, 3);
		HornL13.setRotationPoint(15F, 3F, -10.5F);
		HornL13.setTextureSize(64, 32);
		HornL13.mirror = true;
		setRotation(HornL13, 0F, 0F, 0F);
		HornL14 = new ModelRenderer(this, 84, 28);
		HornL14.addBox(0F, 0F, 0F, 2, 2, 2);
		HornL14.setRotationPoint(16.5F, 2F, -9F);
		HornL14.setTextureSize(64, 32);
		HornL14.mirror = true;
		setRotation(HornL14, 0F, 0F, 0F);
		HornL15 = new ModelRenderer(this, 84, 32);
		HornL15.addBox(0F, 0F, 0F, 1, 1, 1);
		HornL15.setRotationPoint(18F, 1.5F, -8F);
		HornL15.setTextureSize(64, 32);
		HornL15.mirror = true;
		setRotation(HornL15, 0F, 0F, 0F);
		Tail1 = new ModelRenderer(this, 84, 34);
		Tail1.addBox(0F, 0F, 0F, 10, 12, 4);
		Tail1.setRotationPoint(-5F, -4F, 26F);
		Tail1.setTextureSize(64, 32);
		Tail1.mirror = true;
		setRotation(Tail1, 0F, 0F, 0F);
		Tail2 = new ModelRenderer(this, 76, 56);
		Tail2.addBox(0F, 0F, 0F, 9, 12, 4);
		Tail2.setRotationPoint(-4.5F, -2.5F, 30F);
		Tail2.setTextureSize(64, 32);
		Tail2.mirror = true;
		setRotation(Tail2, -0.1115358F, 0F, 0F);
		Tail3 = new ModelRenderer(this, 76, 72);
		Tail3.addBox(0F, 0F, 0F, 8, 12, 4);
		Tail3.setRotationPoint(-4F, -1F, 34F);
		Tail3.setTextureSize(64, 32);
		Tail3.mirror = true;
		setRotation(Tail3, -0.2230717F, 0F, 0F);
		Tail4 = new ModelRenderer(this, 76, 88);
		Tail4.addBox(0F, 0F, 0F, 7, 12, 4);
		Tail4.setRotationPoint(-3.5F, 1F, 38F);
		Tail4.setTextureSize(64, 32);
		Tail4.mirror = true;
		setRotation(Tail4, -0.3717861F, 0F, 0F);
		Tail5 = new ModelRenderer(this, 72, 104);
		Tail5.addBox(0F, 0F, 0F, 6, 10, 4);
		Tail5.setRotationPoint(-3F, 4F, 41F);
		Tail5.setTextureSize(64, 32);
		Tail5.mirror = true;
		setRotation(Tail5, -0.5205006F, 0F, 0F);
		Tail6 = new ModelRenderer(this, 100, 0);
		Tail6.addBox(0F, 0F, 0F, 5, 8, 4);
		Tail6.setRotationPoint(-2.5F, 7F, 43.5F);
		Tail6.setTextureSize(64, 32);
		Tail6.mirror = true;
		setRotation(Tail6, -0.5948578F, 0F, 0F);
		Tail7 = new ModelRenderer(this, 100, 12);
		Tail7.addBox(0F, 0F, 0F, 4, 6, 4);
		Tail7.setRotationPoint(-2F, 10F, 45F);
		Tail7.setTextureSize(64, 32);
		Tail7.mirror = true;
		setRotation(Tail7, -0.5205006F, 0F, 0F);
		Tail8 = new ModelRenderer(this, 100, 22);
		Tail8.addBox(0F, 0F, 0F, 3, 4, 4);
		Tail8.setRotationPoint(-1.5F, 12.5F, 47F);
		Tail8.setTextureSize(64, 32);
		Tail8.mirror = true;
		setRotation(Tail8, -0.3892394F, 0F, 0F);
		head = new ModelRenderer(this, 0, 56);
		head.addBox(0F, 0F, 0F, 16, 16, 6);
		head.setRotationPoint(-8F, -4F, -14F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 0, 0);
		body.addBox(-6F, -10F, -7F, 20, 34, 22);
		body.setRotationPoint(-4F, 9F, 2F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 1.570796F, 0F, 0F);
		LegRBack = new ModelRenderer(this, 102, 50);
		LegRBack.addBox(0F, 0F, 0F, 5, 8, 5);
		LegRBack.setRotationPoint(-8F, 16F, 18F);
		LegRBack.setTextureSize(64, 32);
		LegRBack.mirror = true;
		setRotation(LegRBack, 0F, 0F, 0F);
		LegLBack = new ModelRenderer(this, 0, 87);
		LegLBack.addBox(0F, 0F, 0F, 5, 8, 5);
		LegLBack.setRotationPoint(4F, 16F, 18F);
		LegLBack.setTextureSize(64, 32);
		LegLBack.mirror = true;
		setRotation(LegLBack, 0F, 0F, 0F);
		LegRFront = new ModelRenderer(this, 0, 100);
		LegRFront.addBox(0F, 0F, 0F, 5, 8, 5);
		LegRFront.setRotationPoint(-8F, 16F, -6F);
		LegRFront.setTextureSize(64, 32);
		LegRFront.mirror = true;
		setRotation(LegRFront, 0F, 0F, 0F);
		LegLFront = new ModelRenderer(this, 0, 113);
		LegLFront.addBox(0F, 0F, 0F, 5, 8, 5);
		LegLFront.setRotationPoint(3F, 16F, -6F);
		LegLFront.setTextureSize(64, 32);
		LegLFront.mirror = true;
		setRotation(LegLFront, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		HornR1.render(f5);
		HornR2.render(f5);
		HornR3.render(f5);
		HornR4.render(f5);
		HornR5.render(f5);
		HornR6.render(f5);
		HornR7.render(f5);
		HornR8.render(f5);
		HornR9.render(f5);
		HornR10.render(f5);
		HornR11.render(f5);
		HornR12.render(f5);
		HornR13.render(f5);
		HornR14.render(f5);
		HornR15.render(f5);
		HornL1.render(f5);
		HornL2.render(f5);
		HornL3.render(f5);
		HornL4.render(f5);
		HornL5.render(f5);
		HornL6.render(f5);
		HornL7.render(f5);
		HornL8.render(f5);
		HornL9.render(f5);
		HornL10.render(f5);
		HornL11.render(f5);
		HornL12.render(f5);
		HornL13.render(f5);
		HornL14.render(f5);
		HornL15.render(f5);
		Tail1.render(f5);
		Tail2.render(f5);
		Tail3.render(f5);
		Tail4.render(f5);
		Tail5.render(f5);
		Tail6.render(f5);
		Tail7.render(f5);
		Tail8.render(f5);
		head.render(f5);
		body.render(f5);
		LegRBack.render(f5);
		LegLBack.render(f5);
		LegRFront.render(f5);
		LegLFront.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		LegRFront.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * animScale * f1 * 0.5F;
		LegLFront.rotateAngleX = MathHelper.cos(f * 0.6662F) * animScale * f1 * 0.5F;
		LegRFront.rotateAngleZ = 0.0F;
		LegLFront.rotateAngleZ = 0.0F;

		LegRBack.rotateAngleX = MathHelper.cos(f * 0.6662F) * animScale * f1;
		LegLBack.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * animScale * f1;
		LegRBack.rotateAngleY = 0.0F;
		LegLBack.rotateAngleY = 0.0F;
	}

}
