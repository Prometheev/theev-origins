package com.prometheev.theev_origins.entity.custom;

import com.prometheev.theev_origins.theev_origins;
import com.prometheev.theev_origins.effect.GoldenFlight;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITIES = 
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, theev_origins.MODID);

    public static final RegistryObject<EntityType<FairyDustEntity>> FAIRYDUST = ENTITIES.register("fairy_dust",
    () -> EntityType.Builder.<FairyDustEntity>of(FairyDustEntity::new, MobCategory.MISC).sized(0.5f,0.5f)
    .build(new ResourceLocation(theev_origins.MODID,"fairy_dust").toString()));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }

}
