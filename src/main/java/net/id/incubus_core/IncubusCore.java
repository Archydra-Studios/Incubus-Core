package net.id.incubus_core;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.id.incubus_core.misc.WorthinessChecker;
import net.id.incubus_core.recipe.matchbook.IncubusMatches;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;

public class IncubusCore implements ModInitializer {

	public static final String MODID = "incubus_core";
	public static final Logger LOG = LogUtils.getLogger();

	@Override
	public void onInitialize() {
		WorthinessChecker.init();
		IncubusMatches.init();
	}

	public static Identifier locate(String path) {
		return new Identifier(MODID, path);
	}
}
