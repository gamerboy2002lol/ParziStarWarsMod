package com.parzivail.pswm.mobs;

import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.ai.AiFreqMove;

public class MobEwok extends EntityAnimal implements IAnimals
{
	private DataWatcher dw;

	public MobEwok(World par1World)
	{
		super(par1World);
		this.setSize(0.5F, 1.5F);
		this.dw = super.getDataWatcher();
		this.tasks.addTask(0, new AiFreqMove(this, 1, 0));
		this.setCurrentItemOrArmor(0, new net.minecraft.item.ItemStack(StarWarsMod.ewokSpear, 1));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.55D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_)
	{
		return null;
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.getDataWatcher().addObject(25, Integer.valueOf(this.rand.nextInt(3)));
	}

	protected Item func_146068_u()
	{
		switch (this.rand.nextInt(60))
		{
			case 36:
				this.dropItem(StarWarsMod.ewokSpear, 1);
		}
		return Item.getItemFromBlock(net.minecraft.init.Blocks.leaves);
	}

	@Override
	protected String getDeathSound()
	{
		return Resources.MODID + ":" + "mob.ewok.die";
	}

	@Override
	protected String getHurtSound()
	{
		return Resources.MODID + ":" + "mob.ewok.hit";
	}

	@Override
	protected String getLivingSound()
	{
		return Resources.MODID + ":" + "mob.ewok.say";
	}

	private int getType()
	{
		return this.getDataWatcher().getWatchableObjectInt(25);
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\mobs\MobEwok.class Java compiler
 * version: 6 (50.0) JD-Core Version: 0.7.1
 */