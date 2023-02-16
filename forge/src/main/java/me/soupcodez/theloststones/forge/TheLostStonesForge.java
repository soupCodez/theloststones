package me.soupcodez.theloststones.forge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.threetag.palladiumcore.forge.PalladiumCoreForge;
import net.threetag.palladiumcore.util.Platform;
import me.soupcodez.theloststones.TheLostStones;
import me.soupcodez.theloststones.TheLostStonesClient;

@Mod(TheLostStones.MOD_ID)
@Mod.EventBusSubscriber(modid = TheLostStones.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLostStonesForge {

    public TheLostStonesForge() {
        PalladiumCoreForge.registerModEventBus(TheLostStones.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        TheLostStones.init();

        if (Platform.isClient()) {
            TheLostStonesClient.init();
        }
    }
}
