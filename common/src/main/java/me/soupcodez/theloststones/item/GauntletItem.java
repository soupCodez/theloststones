package me.soupcodez.theloststones.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.threetag.palladiumcore.item.IPalladiumItem;

public class GauntletItem extends Item implements IPalladiumItem, canRightClickEquip {
    public GauntletItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    public static final int MAX_STACK_SIZE = 1;

    @Override
    public EquipmentSlot getEquipmentSlot(ItemStack stack) {
        return EquipmentSlot.OFFHAND;
    }

    @Override
    public boolean canRightClickEquip() {
        return true;
    }
}
