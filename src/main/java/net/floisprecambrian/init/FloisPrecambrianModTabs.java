
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floisprecambrian.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.floisprecambrian.FloisPrecambrianMod;

public class FloisPrecambrianModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloisPrecambrianMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PRECAMBRIANTAB = REGISTRY.register("precambriantab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.flois_precambrian.precambriantab")).icon(() -> new ItemStack(FloisPrecambrianModItems.PROTEROZOIC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FloisPrecambrianModItems.HADEAN.get());
				tabData.accept(FloisPrecambrianModBlocks.BLACKSAND.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.LAVACOBBLESTONE.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.LAVAROCK.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.MOLTEN_LAVACOBBLESTONE.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.HADEANPORTALBLOCK.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.METEORITICIRON.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.ZIRCONORE.get().asItem());
				tabData.accept(FloisPrecambrianModItems.ZIRCONITEM.get());
				tabData.accept(FloisPrecambrianModBlocks.ZIRCONBLOCK.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.LIGHT_ASH.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.ASH.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.DARK_ASH.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.ARCHEANPORTALBLOCK.get().asItem());
				tabData.accept(FloisPrecambrianModItems.ARCHEAN.get());
				tabData.accept(FloisPrecambrianModBlocks.RIPPLEDBLACKSAND.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.ARCHEAN_MICROBIALMAT.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.PROTEROZOICPORTALBLOCK.get().asItem());
				tabData.accept(FloisPrecambrianModItems.PROTEROZOIC.get());
				tabData.accept(FloisPrecambrianModBlocks.IRONSAND.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.RIPPLEDIRONSAND.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.MICROBIALMATT.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.TAWUIA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.ANCIENTMUD.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.GRYPANIA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.REDALGAE.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.GREENALGAE.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.STROMATOLITE.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.IRONSTONE.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.HORODYSKIA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.BACTERIALMAT.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.BOMAKELLIA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.FUNISIA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.HELICOLOCELLUS.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.BELTANELLIFORMIS.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.SCORIA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.ARBOREA.get().asItem());
				tabData.accept(FloisPrecambrianModBlocks.RANGEA.get().asItem());
			}).withSearchBar().build());
}
