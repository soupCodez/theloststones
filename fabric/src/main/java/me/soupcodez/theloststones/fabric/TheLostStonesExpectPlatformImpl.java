package me.soupcodez.theloststones.fabric;

import me.soupcodez.theloststones.TheLostStonesExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class TheLostStonesExpectPlatformImpl {
    /**
     * This is our actual method to {@link TheLostStonesExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
