package com.notcharrow.streetscenery;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreetScenery implements ModInitializer {
	public static final String MOD_ID = "street-scenery";

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}