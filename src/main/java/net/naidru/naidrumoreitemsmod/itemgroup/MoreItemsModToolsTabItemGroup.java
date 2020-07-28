
package net.naidru.naidrumoreitemsmod.itemgroup;

import net.naidru.naidrumoreitemsmod.item.TinPickaxeItem;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruMoreItemsModModElements.ModElement.Tag
public class MoreItemsModToolsTabItemGroup extends NaidruMoreItemsModModElements.ModElement {
	public MoreItemsModToolsTabItemGroup(NaidruMoreItemsModModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_items_mod_tools_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TinPickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
