package com.parzivail.pswm.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

import com.parzivail.util.ui.Lumberjack;
import com.parzivail.util.vehicle.VehicleAirBase;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketShipTargetLock implements IMessage
{
	public static class Handler implements IMessageHandler<PacketShipTargetLock, IMessage>
	{
		@Override
		public IMessage onMessage(PacketShipTargetLock message, MessageContext ctx)
		{
			try
			{
				EntityPlayer player = MinecraftServer.getServer().worldServerForDimension(message.dim).getPlayerEntityByName(message.player);
				if (player.ridingEntity instanceof VehicleAirBase)
					((VehicleAirBase)player.ridingEntity).setTargetLock(message.targetLock);
			}
			catch (Exception e)
			{
				Lumberjack.info("Something went very wrong.");
				e.printStackTrace();
			}
			return null;
		}
	}

	private String player;
	private boolean targetLock;
	private int dim;

	public PacketShipTargetLock()
	{
	}

	public PacketShipTargetLock(String player, boolean targetLock, int dim)
	{
		this.player = player;
		this.targetLock = targetLock;
		this.dim = dim;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		this.player = ByteBufUtils.readUTF8String(buf);
		this.targetLock = ByteBufUtils.readVarInt(buf, 2) == 1;
		this.dim = ByteBufUtils.readVarInt(buf, 5);
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		ByteBufUtils.writeUTF8String(buf, this.player);
		ByteBufUtils.writeVarInt(buf, this.targetLock ? 1 : 0, 2);
		ByteBufUtils.writeVarInt(buf, this.dim, 5);
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\network\TeleportPlayerNetwork.class
 * Java compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */