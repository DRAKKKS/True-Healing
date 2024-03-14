
package net.mcreator.trueheal.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.trueheal.procedures.TrueHealOnEffectActiveTickProcedure;
import net.mcreator.trueheal.procedures.TrueHealActiveTickConditionProcedure;

public class TrueHealMobEffect extends MobEffect {
	public TrueHealMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52225);
	}

	@Override
	public String getDescriptionId() {
		return "effect.trueheal.true_heal";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TrueHealOnEffectActiveTickProcedure.execute(entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return TrueHealActiveTickConditionProcedure.execute(amplifier, duration);
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
