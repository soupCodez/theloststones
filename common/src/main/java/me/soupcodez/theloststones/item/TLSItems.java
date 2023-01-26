package me.soupcodez.theloststones.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.soupcodez.theloststones.TheLostStones;
import me.soupcodez.theloststones.TheLostStonesTab;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class TLSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(TheLostStones.MOD_ID,
            Registry.ITEM_REGISTRY);

    public static final RegistrySupplier<Item> INFINITY_GAUNTLET = ITEMS.register("infinity_gauntlet",
            () -> new GauntletItem(new Item.Properties().tab(TheLostStonesTab.TLS_TAB).rarity(Rarity.EPIC)));
}
