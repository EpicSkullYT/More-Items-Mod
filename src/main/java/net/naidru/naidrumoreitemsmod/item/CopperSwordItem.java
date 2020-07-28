
package net.naidru.naidrumoreitemsmod.item;

import net.naidru.naidrumoreitemsmod.itemgroup.MoreItemsModWeaponsTabItemGroup;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@NaidruMoreItemsModModElements.ModElement.Tag
public class CopperSwordItem extends NaidruMoreItemsModModElements.ModElement {
	@ObjectHolder("naidru_more_items_mod:copper_sword")
	public static final Item block = null;
	public CopperSwordItem(NaidruMoreItemsModModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 95;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(MoreItemsModWeaponsTabItemGroup.tab)) {
		}.setRegistryName("copper_sword"));
	}
}
