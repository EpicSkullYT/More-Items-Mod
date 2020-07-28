
package net.naidru.naidrumoreitemsmod.itemgroup;

import net.naidru.naidrumoreitemsmod.item.TinArmorItem;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruMoreItemsModModElements.ModElement.Tag
public class MoreItemsModArmorTabItemGroup extends NaidruMoreItemsModModElements.ModElement {
	public MoreItemsModArmorTabItemGroup(NaidruMoreItemsModModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_items_mod_armor_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TinArmorItem.helmet, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
