package me.soupcodez.theloststones;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.threetag.palladiumcore.registry.CreativeModeTabRegistry;

public class TheLostStonesTab {
    public static final CreativeModeTab TLS_TAB = CreativeModeTabRegistry.create(
            new ResourceLocation(TheLostStones.MOD_ID, "tls_tab"),
            () -> new ItemStack(Items.STONE)
    );
}
