package com.parzivail.util.entity.trade;

import java.util.List;
import java.util.Random;

public class TradeUtils
{
	public static int fluxPrice(Random rand, int price, int amount)
	{
		int x = rand.nextInt(price + amount - (price - amount) + 1) + price - amount;
		if (x > 64)
			x = 64;
		else if (x < 1)
			x = 1;
		return x;
	}

	public static WeightedTradeItem getWeightedItemFromList(List<WeightedTradeItem> items, Random rand)
	{
		int length = items.toArray().length;
		double totalWeight = 0.0D;
		for (int i = 0; i < length; i++)
			totalWeight += items.get(i).weight;
		int randomIndex = -1;
		double random = rand.nextDouble() * totalWeight;
		for (int i = 0; i < length; i++)
		{
			random -= items.get(i).weight;
			if (random <= 0.0D)
			{
				randomIndex = i;
				break;
			}
		}
		return items.get(randomIndex);
	}
}