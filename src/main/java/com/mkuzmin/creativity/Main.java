package com.mkuzmin.creativity;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final Item PIZZA_PIECE;

	static {
		FoodComponent fcPizzaPiece = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.1f).build();
		PIZZA_PIECE = new Item((new Item.Settings()).group(ItemGroup.FOOD).food(fcPizzaPiece));
	}

	@Override
	public void onInitialize()
	{
		Registry.register(Registry.ITEM, new Identifier("creativity", "pizza_piece"), PIZZA_PIECE);
	}
}
