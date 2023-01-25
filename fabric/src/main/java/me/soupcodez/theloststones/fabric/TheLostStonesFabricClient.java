package me.soupcodez.theloststones.fabric;

import net.fabricmc.api.ClientModInitializer;
import me.soupcodez.theloststones.TheLostStonesClient;

public class TheLostStonesFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TheLostStonesClient.init();
    }

}
