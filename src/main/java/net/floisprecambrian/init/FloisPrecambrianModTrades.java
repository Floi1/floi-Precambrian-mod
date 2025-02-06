
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.floisprecambrian.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class FloisPrecambrianModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 4), new ItemStack(FloisPrecambrianModBlocks.HADEANPORTALBLOCK.get()), 12, 30, 0.2f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 4), new ItemStack(FloisPrecambrianModBlocks.ARCHEANPORTALBLOCK.get()), 12, 30, 0.2f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 3), new ItemStack(FloisPrecambrianModBlocks.HADEANPORTALBLOCK.get()), 12, 30, 0.3f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 3), new ItemStack(FloisPrecambrianModBlocks.ARCHEANPORTALBLOCK.get()), 12, 30, 0.3f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 4), new ItemStack(FloisPrecambrianModBlocks.PROTEROZOICPORTALBLOCK.get()), 10, 30, 0.4f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 3), new ItemStack(FloisPrecambrianModBlocks.PROTEROZOICPORTALBLOCK.get()), 10, 30, 0.4f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT), new ItemStack(FloisPrecambrianModItems.HADEAN.get()), 4, 30, 0.2f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT), new ItemStack(FloisPrecambrianModItems.ARCHEAN.get()), 4, 30, 0.3f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT), new ItemStack(FloisPrecambrianModItems.PROTEROZOIC.get()), 4, 30, 0.4f));
		}
	}
}
