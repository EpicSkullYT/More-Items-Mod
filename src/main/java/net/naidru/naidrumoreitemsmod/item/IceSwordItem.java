
package net.naidru.naidrumoreitemsmod.item;

import net.naidru.naidrumoreitemsmod.itemgroup.MoreItemsModWeaponsTabItemGroup;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@NaidruMoreItemsModModElements.ModElement.Tag
public class IceSwordItem extends NaidruMoreItemsModModElements.ModElement {
	@ObjectHolder("naidru_more_items_mod:ice_sword")
	public static final Item block = null;
	public IceSwordItem(NaidruMoreItemsModModElements instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 58f;
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
		}, 3, -3f, new Item.Properties().group(MoreItemsModWeaponsTabItemGroup.tab)) {
		}.setRegistryName("ice_sword"));
	}
}
