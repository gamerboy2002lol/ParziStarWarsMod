package com.parzivail.pswm.rendering.vehicles;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.models.vehicles.ModelJakkuSpeeder;

public class RenderJakkuSpeeder extends RenderLandBase
{
	public static ResourceLocation texture = new ResourceLocation(Resources.MODID, "textures/models/jakkuSpeeder.png");

	public RenderJakkuSpeeder(ModelJakkuSpeeder modelSpeederBike, float par2)
	{
		super(modelSpeederBike, par2);
		this.scale = 3;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\
 * parzi\starwarsmod\rendering\vehicles\RenderSpeederBike.class Java compiler
 * version: 6 (50.0) JD-Core Version: 0.7.1
 */