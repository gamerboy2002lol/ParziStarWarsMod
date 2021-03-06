package com.parzivail.pswm.rendering.gui;

import net.minecraftforge.client.event.RenderGameOverlayEvent;

import com.parzivail.pswm.handlers.ClientEventHandler;
import com.parzivail.util.Animation;

public class AnimationCrosshairOpen extends Animation
{
	int color;

	public AnimationCrosshairOpen(int color)
	{
		super(8, false, true);
		ClientEventHandler.isCursorAnim = true;
		this.color = color;
	}

	@Override
	public void render(RenderGameOverlayEvent event)
	{
		super.render(event);

		ClientEventHandler.pgui.drawFancyCursor(event, (this.length - this.tick) / (float)this.length, this.color);
	}

	@Override
	public void tick()
	{
		super.tick();
		if (this.tick == this.length)
		{
			ClientEventHandler.isCursorAnim = false;
			ClientEventHandler.cursorOpen = true;
		}
	}
}
