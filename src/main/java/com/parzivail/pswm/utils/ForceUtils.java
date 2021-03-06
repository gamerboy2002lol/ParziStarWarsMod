package com.parzivail.pswm.utils;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.entity.Entity;

import org.apache.commons.io.IOUtils;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.jedirobes.ArmorJediRobes;
import com.parzivail.pswm.jedirobes.powers.Power;
import com.parzivail.pswm.jedirobes.powers.PowerDefend;
import com.parzivail.pswm.jedirobes.powers.PowerDeflect;
import com.parzivail.pswm.jedirobes.powers.PowerDestruction;
import com.parzivail.pswm.jedirobes.powers.PowerDisable;
import com.parzivail.pswm.jedirobes.powers.PowerDrainKnowledge;
import com.parzivail.pswm.jedirobes.powers.PowerGrab;
import com.parzivail.pswm.jedirobes.powers.PowerHeal;
import com.parzivail.pswm.jedirobes.powers.PowerJump;
import com.parzivail.pswm.jedirobes.powers.PowerLightning;
import com.parzivail.pswm.jedirobes.powers.PowerNaturalAwareness;
import com.parzivail.pswm.jedirobes.powers.PowerPull;
import com.parzivail.pswm.jedirobes.powers.PowerPush;
import com.parzivail.pswm.jedirobes.powers.PowerSlow;
import com.parzivail.util.ui.Lumberjack;

public class ForceUtils
{
	public static class EntityCooldownEntry
	{
		public int cooldownLeft;
		public int cooldown;
		public Entity entity;
		public String effect;

		public EntityCooldownEntry(Entity entity, String effect, int cooldown)
		{
			this.cooldownLeft = cooldown;
			this.cooldown = cooldown;
			this.entity = entity;
			this.effect = effect;
		}
	}

	public static Power activePower = null;
	public static boolean isUsingDuration = false;
	public static int health = 0;
	public static float distanceToEntity = -1;

	public static ArrayList<Power> coolingPowers = new ArrayList<Power>();

	public static ArrayList<EntityCooldownEntry> entitiesWithEffects = new ArrayList<EntityCooldownEntry>();

	public static HashMap<String, Power> powers = new HashMap<String, Power>();

	static
	{
		powers.put("jump", new PowerJump(0));
		powers.put("push", new PowerPush(0));
		powers.put("pull", new PowerPull(0));
		powers.put("lightning", new PowerLightning(0));
		powers.put("destruction", new PowerDestruction(0));
		powers.put("defend", new PowerDefend(0));
		powers.put("deflect", new PowerDeflect(0));
		powers.put("naturalAwareness", new PowerNaturalAwareness(0));
		powers.put("grab", new PowerGrab(0));
		powers.put("disable", new PowerDisable(0));
		powers.put("slow", new PowerSlow(0));
		powers.put("healing", new PowerHeal(0));
		powers.put("drainKnowledge", new PowerDrainKnowledge(0));
	}

	public static void addLeaderboardSide(String side)
	{
		InputStream in = null;
		try
		{
			in = new URL(Resources.robesLeaderboardAddLink + "?m=add&s=" + side).openStream();
			IOUtils.toString(in);
			IOUtils.closeQuietly(in);
		}
		catch (Exception e)
		{
			Lumberjack.warn("Couldn't add leaderboard stats!");
			e.printStackTrace();
		}
		finally
		{
			if (in != null)
				IOUtils.closeQuietly(in);
		}
	}

	public static String[] getAllPowers()
	{
		return new String[] { "jump", "push", "pull", "defend", "disable", "deflect", "grab", "healing", "naturalAwareness", "slow", "drainKnowledge", "lightning", "destruction" };
	}

	public static String[] getBasicPowers()
	{
		return new String[] { "jump", "push", "pull", "defend", "disable", "deflect", "grab" };
	}

	public static String[] getJediPowers()
	{
		return new String[] { "healing", "naturalAwareness" };
	}

	public static int getLeaderboardSide(String side)
	{
		InputStream in = null;
		try
		{
			in = new URL(Resources.robesLeaderboardAddLink + "?m=get&s=" + side).openStream();
			String n = IOUtils.toString(in);
			IOUtils.closeQuietly(in);
			return Integer.parseInt(n);
		}
		catch (Exception e)
		{
			Lumberjack.warn("Couldn't get leaderboard stats!");
			e.printStackTrace();
		}
		finally
		{
			if (in != null)
				IOUtils.closeQuietly(in);
		}
		return 0;
	}

	public static ArrayList<String> getPowersAvailableAtLevel(String side, int level)
	{
		ArrayList<String> r = new ArrayList<String>();

		r.add("jump");
		r.add("push");

		if (level > 5)
			r.add("pull");
		if (level > 10)
			r.add("defend");
		if (level > 15)
			r.add("disable");
		if (level > 20)
			r.add("deflect");
		if (level > 25)
			r.add("grab");

		if (side.equals(ArmorJediRobes.SIDE_JEDI))
		{
			if (level > 30)
				r.add("healing");
			if (level > 35)
				r.add("naturalAwareness");
		}
		else if (side.equals(ArmorJediRobes.SIDE_SITH))
		{
			if (level > 35)
				r.add("slow");
			if (level > 40)
				r.add("drainKnowledge");
			if (level > 45)
				r.add("lightning");
			if (level > 50)
				r.add("destruction");
		}

		return r;
	}

	public static String[] getSithPowers()
	{
		return new String[] { "slow", "drainKnowledge", "lightning", "destruction" };
	}

	public static String getTitle(String side, int level)
	{
		String s = side.equals(ArmorJediRobes.SIDE_JEDI) ? "Jedi " : "Sith ";
		if (side.equals(ArmorJediRobes.SIDE_JEDI))
		{
			if (level < 15)
				s += "Padawan";
			else if (level < 35)
				s += "Knight";
			else
				s += "Master";
		}
		else if (level < 45)
			s += "Acolyte";
		else if (level < 55)
			s += "Apprentice";
		else
			s += "Lord";
		return s;
	}

	public static boolean isCooling(String power)
	{
		for (Power p : coolingPowers)
			if (p.name.equals(power))
				return true;
		return false;
	}
}