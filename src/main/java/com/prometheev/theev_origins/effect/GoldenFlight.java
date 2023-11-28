package com.prometheev.theev_origins.effect;

import javax.swing.text.html.parser.Entity;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class GoldenFlight extends MobEffect{

    protected GoldenFlight(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity p_19467_, int p_19468_) {
        super.applyEffectTick(p_19467_, p_19468_);
    }

    

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        // TODO Auto-generated method stub
        return super.isDurationEffectTick(p_19455_, p_19456_);
    }

    

    
    
}
