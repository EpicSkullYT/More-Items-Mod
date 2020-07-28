
package net.naidru.naidrumoreitemsmod.itemgroup;

import net.naidru.naidrumoreitemsmod.block.RecyclerBlock;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruMoreItemsModModElements.ModElement.Tag
public class MoreItemsModMiscTabItemGroup extends NaidruMoreItemsModModElements.ModElement {
	public MoreItemsModMiscTabItemGroup(NaidruMoreItemsModModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_items_mod_misc_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RecyclerBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
