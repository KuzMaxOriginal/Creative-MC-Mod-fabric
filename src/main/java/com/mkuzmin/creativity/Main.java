package com.mkuzmin.creativity;

import com.mkuzmin.creativity.block.PizzaBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final Item ITEM_PIZZA_PIECE;
	public static final Item ITEM_CAKE;

	public static final Block BLOCK_PIZZA;

	static {

		// Blocks
		BLOCK_PIZZA = new PizzaBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5F, 0.5F).sounds(BlockSoundGroup.WOOL).build());

		// Items
		FoodComponent fcPizzaPiece = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.1f).build();
		ITEM_PIZZA_PIECE = new Item((new Item.Settings()).group(ItemGroup.FOOD).food(fcPizzaPiece));
		ITEM_CAKE = new BlockItem(BLOCK_PIZZA, (new Item.Settings()).maxCount(1).group(ItemGroup.FOOD));
	}

	@Override
	public void onInitialize()
	{
		Registry.register(Registry.MOTIVE, new Identifier("creativity", "pizzeria_banner"), new PaintingMotive(64, 48));

		Registry.register(Registry.BLOCK, new Identifier("creativity", "pizza"), BLOCK_PIZZA);

		Registry.register(Registry.ITEM, new Identifier("creativity", "pizza_piece"), ITEM_PIZZA_PIECE);
		Registry.register(Registry.ITEM, new Identifier("creativity", "pizza"), ITEM_CAKE);
	}
}