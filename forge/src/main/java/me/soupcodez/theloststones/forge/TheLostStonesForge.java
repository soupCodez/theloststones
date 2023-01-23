package me.soupcodez.theloststones.forge;

import dev.architectury.platform.forge.EventBuses;
import me.soupcodez.theloststones.TheLostStones;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TheLostStones.MOD_ID)
public class TheLostStonesForge {
    public TheLostStonesForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TheLostStones.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TheLostStones.init();
    }
}
