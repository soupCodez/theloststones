package me.soupcodez.theloststones.ability;

import net.minecraft.world.level.Level;
import net.threetag.palladium.power.Power;
import net.threetag.palladium.power.PowerManager;
import net.threetag.palladium.power.ability.Ability;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;
import me.soupcodez.theloststones.TheLostStones;

public class TLSAbilities {

    public static final DeferredRegister<Ability> ABILITIES = DeferredRegister.create(TheLostStones.MOD_ID, Ability.REGISTRY);

    public static final RegistrySupplier<Ability> Gauntlet = ABILITIES.register("infinity_gauntlet",
            GauntletAbility::new);

    public static Power getGauntletPower(Level level) {
        return PowerManager.getInstance(level).getPower(TheLostStones.id("infinity_gauntlet"));
    }

}
