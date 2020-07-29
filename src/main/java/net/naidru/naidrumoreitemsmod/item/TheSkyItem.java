
package net.naidru.naidrumoreitemsmod.item;

import net.naidru.naidrumoreitemsmod.world.dimension.TheSkyDimension;
import net.naidru.naidrumoreitemsmod.itemgroup.MoreItemsModToolsTabItemGroup;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

public class TheSkyItem extends Item {
	@ObjectHolder("naidru_more_items_mod:the_sky")
	public static final Item block = null;
	public TheSkyItem() {
		super(new Item.Properties().group(MoreItemsModToolsTabItemGroup.tab).maxDamage(64));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity entity = context.getPlayer();
		BlockPos pos = context.getPos().offset(context.getFace());
		ItemStack itemstack = context.getItem();
		World world = context.getWorld();
		if (!entity.canPlayerEdit(pos, context.getFace(), itemstack)) {
			return ActionResultType.FAIL;
		} else {
			if (world.isAirBlock(pos))
				TheSkyDimension.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity, c -> c.sendBreakAnimation(context.getHand()));
			return ActionResultType.SUCCESS;
		}
	}
}
