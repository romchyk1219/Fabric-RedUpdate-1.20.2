package net.romchyk1219.redupdate;

import net.romchyk1219.redupdate.block.ModBlocks;
import net.romchyk1219.redupdate.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedUpdate implements ModInitializer {
	public static final String MOD_ID = "redupdate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}