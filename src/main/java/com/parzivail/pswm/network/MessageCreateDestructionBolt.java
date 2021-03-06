package com.parzivail.pswm.network;

import net.minecraft.entity.player.EntityPlayer;

import com.parzivail.pswm.entities.EntityDestruction;
import com.parzivail.util.network.PMessage;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class MessageCreateDestructionBolt extends PMessage<MessageCreateDestructionBolt>
{
	public EntityPlayer sender;
	public int radius;

	public MessageCreateDestructionBolt()
	{
	}

	public MessageCreateDestructionBolt(EntityPlayer sender, int radius)
	{
		this.sender = sender;
		this.radius = radius;
	}

	@Override
	public IMessage handleMessage(MessageContext context)
	{
		this.sender.worldObj.spawnEntityInWorld(new EntityDestruction(this.sender.worldObj, this.sender, this.radius));
		return null;
	}
}