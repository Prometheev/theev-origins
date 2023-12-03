package com.prometheev.theev_origins.entity.custom;

import com.prometheev.theev_origins.item.Items;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class FairyDustEntity extends ThrowableItemProjectile{
    
    public FairyDustEntity(EntityType<? extends ThrowableItemProjectile> p_37248_, Level p_37249_) {
        super(p_37248_, p_37249_);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity hitEntity = entityHitResult.getEntity();
        if (hitEntity instanceof LivingEntity){
            ((LivingEntity)hitEntity).addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100));
        }
        this.discard();
    }

    @Override
    protected Item getDefaultItem() {
        return Items.FAIRYDUST.get();
    }

}
