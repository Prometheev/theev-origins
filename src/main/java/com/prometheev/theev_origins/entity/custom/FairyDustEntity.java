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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;

public class FairyDustEntity extends ThrowableItemProjectile{

    private int lifeTime;
    public static final int MAXLIFE = 600;
    
    public FairyDustEntity(EntityType<? extends ThrowableItemProjectile> p_37248_, Level p_37249_) {
        super(p_37248_, p_37249_);
        this.setNoGravity(true);
        lifeTime = 0;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity hitEntity = entityHitResult.getEntity();
        if (!this.level.isClientSide){
            if (hitEntity instanceof LivingEntity){
            ((LivingEntity)hitEntity).addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100));
        }
        this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult p_37258_) {
        super.onHitBlock(p_37258_);
        if (!this.level.isClientSide){
            this.discard();
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level.isClientSide){
            doLife();
        }
    }

    @Override
    protected Item getDefaultItem() {
        return Items.FAIRYDUST.get();
    }

    private void doLife(){
        if (lifeTime++ > MAXLIFE){
            this.discard();
        }
    }

}
