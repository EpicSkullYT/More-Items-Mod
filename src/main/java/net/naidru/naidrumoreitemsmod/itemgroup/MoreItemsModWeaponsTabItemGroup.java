
package net.naidru.naidrumoreitemsmod.itemgroup;

import net.naidru.naidrumoreitemsmod.item.TinSwordItem;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruMoreItemsModModElements.ModElement.Tag
public class MoreItemsModWeaponsTabItemGroup extends NaidruMoreItemsModModElements.ModElement {
	public MoreItemsModWeaponsTabItemGroup(NaidruMoreItemsModModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_items_mod_weapons_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TinSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
