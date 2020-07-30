package net.naidru.naidrumoreitemsmod.procedures;

import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@NaidruMoreItemsModModElements.ModElement.Tag
public class BlazePepperFoodEatenProcedure extends NaidruMoreItemsModModElements.ModElement {
	public BlazePepperFoodEatenProcedure(NaidruMoreItemsModModElements instance) {
		super(instance, 151);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlazePepperFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 480, (int) 1, (false), (false)));
	}
}
