
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.floishadean.FloisHadeanModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FloisHadeanModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloisHadeanModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HADEANTAB = REGISTRY.register("hadeantab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.flois_hadean_mod.hadeantab")).icon(() -> new ItemStack(FloisHadeanModModItems.HADEAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FloisHadeanModModBlocks.BLACKSAND.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.LAVACOBBLESTONE.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.LAVAROCK.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.MOLTEN_LAVACOBBLESTONE.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.HADEANPORTALBLOCK.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.METEORITICIRON.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FloisHadeanModModItems.HADEAN.get());
		}
	}
}
