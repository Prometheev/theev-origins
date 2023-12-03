package com.prometheev.theev_origins.item;

import com.prometheev.theev_origins.theev_origins;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items{

    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, theev_origins.MODID);

    public static final RegistryObject<Item> FAIRYDUST = ITEMS.register("fairy_dust",
    () -> new FairyDustItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}