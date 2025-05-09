package com.notcharrow.streetscenery;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block ROADSIGN_BLOCK = registerBlock("roadsign_block",
			new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

	private static void addItemsToGroup(FabricItemGroupEntries entries) {
		entries.add(ROADSIGN_BLOCK);
	}

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(StreetScenery.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, Identifier.of(StreetScenery.MOD_ID, name),
				new BlockItem(block, new Item.Settings()));
	}

	public static void registerModBlocks() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToGroup);
	}
}