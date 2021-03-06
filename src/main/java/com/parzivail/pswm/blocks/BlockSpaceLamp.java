package com.parzivail.pswm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.util.world.HarvestLevel;

public class BlockSpaceLamp extends Block
{
	public String name = "spaceLamp";

	public BlockSpaceLamp()
	{
		super(Material.rock);
		this.setBlockName(Resources.MODID + "." + this.name);
		this.setBlockTextureName(Resources.MODID + ":" + this.name);
		this.setCreativeTab(StarWarsMod.StarWarsTab);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", HarvestLevel.IRON);
		this.setStepSound(soundTypeStone);
		this.setLightLevel(1.0F);
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\blocks\BlockSpaceLamp.class Java
 * compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */