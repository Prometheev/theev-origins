package com.prometheev.theev_origins.effect;

import com.prometheev.theev_origins.theev_origins;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = 
        DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, theev_origins.MODID);

    public static final RegistryObject<MobEffect> GOLDEN_FLIGHT = MOB_EFFECTS.register("golden_flight",
    () -> new GoldenFlight(MobEffectCategory.NEUTRAL, 0));

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
