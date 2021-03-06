package com.parzivail.pswm.jedirobes.powers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.network.MessageHeal;
import com.parzivail.util.entity.EntityUtils;

public class PowerHeal extends Power
{
	public PowerHeal(int currentLevel)
	{
		super("healing");
		this.costBase = 1550;
		this.costMult = 50;
		this.currentLevel = currentLevel;
		this.maxLevel = 5;
		this.rechargeTime = 8 * 40; // 40 ticks/second
		this.recharge = 0;
	}

	@Override
	public boolean run(EntityPlayer player)
	{
		if (this.recharge == 0)
		{
			Entity e = EntityUtils.rayTrace(this.currentLevel * 2, player, new Entity[0]);

			if (e != null)
			{
				StarWarsMod.network.sendToServer(new MessageHeal(e, this.currentLevel));
			}
			else
			{
				StarWarsMod.network.sendToServer(new MessageHeal(player, this.currentLevel));
			}

			return true;
		}
		return false;
	}
}
