
package net.naidru.naidrumoreitemsmod.item;

import net.naidru.naidrumoreitemsmod.itemgroup.MoreItemsModToolsTabItemGroup;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@NaidruMoreItemsModModElements.ModElement.Tag
public class TinHoeItem extends NaidruMoreItemsModModElements.ModElement {
	@ObjectHolder("naidru_more_items_mod:tin_hoe")
	public static final Item block = null;
	public TinHoeItem(NaidruMoreItemsModModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 152;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(MoreItemsModToolsTabItemGroup.tab)) {
		}.setRegistryName("tin_hoe"));
	}
}
