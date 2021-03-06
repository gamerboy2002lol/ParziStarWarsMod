package com.parzivail.pswm.items.weapons;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.achievement.StarWarsAchievements;
import com.parzivail.pswm.entities.EntityBlasterRifleBolt;
import com.parzivail.util.ui.KeyboardUtils;
import com.parzivail.util.ui.TextUtils;

public class ItemWookieeBowcaster extends Item
{
	public String name = "bowcaster";
	private int timeSinceLastShot = 0;
	private int timeToRecharge = 8;

	public ItemWookieeBowcaster()
	{
		this.setCreativeTab(StarWarsMod.StarWarsTab);
		this.setHasSubtypes(true);
		this.setUnlocalizedName(Resources.MODID + "." + this.name);
		this.setTextureName(Resources.MODID + ":" + this.name);
		this.maxStackSize = 1;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		if (KeyboardUtils.isShiftDown())
		{
			list.add(TextUtils.makeItalic("I ain't afraid of Wookiees,"));
			list.add(TextUtils.makeItalic("It's their bowcasters that scare me"));
		}
		if (stack.stackTagCompound != null && stack.stackTagCompound.hasKey("shotsLeft"))
			list.add("Shots Remaining: " + stack.stackTagCompound.getInteger("shotsLeft"));
	}

	@Override
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer entityPlayer)
	{
		if (par1ItemStack.stackTagCompound.getInteger("timeout") < 2)
			if (par1ItemStack.stackTagCompound.getInteger("shotsLeft") > 1)
				entityPlayer.playSound(Resources.MODID + ":" + "item.blasterBow.use", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(Item.itemRand, -0.2D, 0.2D));
			else
				entityPlayer.playSound(Resources.MODID + ":" + "item.blasterRifle.break", 1.0F, 1.0F);
		if (!par2World.isRemote && par1ItemStack.stackTagCompound.getInteger("timeout") == 0)
		{
			par2World.spawnEntityInWorld(new EntityBlasterRifleBolt(par2World, entityPlayer));
			if (par1ItemStack.getItemDamage() == 3)
				par1ItemStack.stackTagCompound.setInteger("timeout", this.timeToRecharge + 10);
			else
				par1ItemStack.stackTagCompound.setInteger("timeout", this.timeToRecharge);
			par1ItemStack.stackTagCompound.setInteger("shotsLeft", par1ItemStack.stackTagCompound.getInteger("shotsLeft") - 1);
			if (par1ItemStack.stackTagCompound.getInteger("shotsLeft") == 0)
			{
				entityPlayer.playSound(Resources.MODID + ":" + "item.blasterRifle.break", 1.0F, 1.0F);
				entityPlayer.inventory.mainInventory[entityPlayer.inventory.currentItem] = null;
			}
		}
		entityPlayer.addStat(StarWarsAchievements.fireBlaster, 1);
		return par1ItemStack;
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_)
	{
		p_77615_1_.stackTagCompound.setInteger("timeout", 0);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int p_77663_4_, boolean p_77663_5_)
	{
		if (!stack.hasTagCompound())
			stack.stackTagCompound = new NBTTagCompound();
		if (!stack.stackTagCompound.hasKey("timeout"))
			stack.stackTagCompound.setInteger("timeout", 0);
		if (!stack.stackTagCompound.hasKey("shotsLeft"))
			stack.stackTagCompound.setInteger("shotsLeft", 250);
		if (stack.stackTagCompound.getInteger("timeout") > 0)
			stack.stackTagCompound.setInteger("timeout", stack.stackTagCompound.getInteger("timeout") - 1);
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\
 * parzi\starwarsmod\items\weapons\ItemWookieeBowcaster.class Java compiler
 * version: 6 (50.0) JD-Core Version: 0.7.1
 */