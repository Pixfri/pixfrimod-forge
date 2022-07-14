package fr.pixfri.pixfrimod;

import fr.pixfri.pixfrimod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PixfriMod implements ModInitializer {
	public static final String MOD_ID = "pixfrimod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Pixfri Mod");

		ModItems.registerModItems();
	}
}
