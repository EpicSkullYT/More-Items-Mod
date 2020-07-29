
package net.naidru.naidrumoreitemsmod.item;

import net.naidru.naidrumoreitemsmod.itemgroup.MoreItemsModToolsTabItemGroup;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@NaidruMoreItemsModModElements.ModElement.Tag
public class IceHoeItem extends NaidruMoreItemsModModElements.ModElement {
	@ObjectHolder("naidru_more_items_mod:ice_hoe")
	public static final Item block = null;
	public IceHoeItem(NaidruMoreItemsModModElements instance) {
		super(instance, 100);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(MoreItemsModToolsTabItemGroup.tab)) {
		}.setRegistryName("ice_hoe"));
	}
}
