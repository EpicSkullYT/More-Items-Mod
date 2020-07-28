
package net.naidru.naidrumoreitemsmod.item;

import net.naidru.naidrumoreitemsmod.itemgroup.MoreItemsModMiscTabItemGroup;
import net.naidru.naidrumoreitemsmod.NaidruMoreItemsModModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@NaidruMoreItemsModModElements.ModElement.Tag
public class TempleScrapItem extends NaidruMoreItemsModModElements.ModElement {
	@ObjectHolder("naidru_more_items_mod:temple_scrap")
	public static final Item block = null;
	public TempleScrapItem(NaidruMoreItemsModModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreItemsModMiscTabItemGroup.tab).maxStackSize(64));
			setRegistryName("temple_scrap");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
