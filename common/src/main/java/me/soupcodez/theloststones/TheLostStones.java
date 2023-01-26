package me.soupcodez.theloststones;

import me.soupcodez.theloststones.ability.TLSAbilities;
import me.soupcodez.theloststones.item.TLSItems;
import net.minecraft.resources.ResourceLocation;
import net.threetag.palladiumcore.util.Platform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TheLostStones {

    public static final String MOD_ID = "theloststones";
    public static final Logger LOGGER = LogManager.getLogger();

    public static void init() {
        if (!Platform.isProduction()) {
            TheLostStonesDebug.init();
        }

        TLSItems.ITEMS.register();
        TLSAbilities.ABILITIES.register();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
