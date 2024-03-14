
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.healingmobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.healingmobs.potion.TrueHealMobEffect;
import net.mcreator.healingmobs.HealingMobsMod;

public class HealingMobsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HealingMobsMod.MODID);
	public static final RegistryObject<MobEffect> TRUE_HEAL = REGISTRY.register("true_heal", () -> new TrueHealMobEffect());
}
