package me.soupcodez.theloststones.fabric;

import net.fabricmc.api.ModInitializer;

public class TheLostStonesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        me.soupcodez.theloststones.TheLostStones.init();
    }
}
