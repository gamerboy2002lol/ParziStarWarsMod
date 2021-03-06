package com.parzivail.pswm.items.weapons;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.util.ui.TextUtils;

public class ItemGamorreanAx extends ItemSword
{
	public String name = "gamorreanAx";

	public ItemGamorreanAx()
	{
		super(StarWarsMod.materialGamorrean);
		this.setUnlocalizedName(Resources.MODID + "." + this.name);
		this.setTextureName(Resources.MODID + ":" + this.name);
		this.setCreativeTab(StarWarsMod.StarWarsTab);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool)
	{
		list.add(TextUtils.makeItalic("What they lacked in subtlty, they more "));
		list.add(TextUtils.makeItalic("than made up for in very damaging blows"));
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\items\weapons\ItemGamorreanAx.class
 * Java compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */