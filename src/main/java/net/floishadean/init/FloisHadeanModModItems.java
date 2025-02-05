
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.floishadean.item.ZirconitemItem;
import net.floishadean.item.ProterozoicItem;
import net.floishadean.item.HadeanItem;
import net.floishadean.item.ArcheanItem;
import net.floishadean.FloisHadeanModMod;

public class FloisHadeanModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FloisHadeanModMod.MODID);
	public static final DeferredItem<Item> HADEAN = REGISTRY.register("hadean", HadeanItem::new);
	public static final DeferredItem<Item> BLACKSAND = block(FloisHadeanModModBlocks.BLACKSAND);
	public static final DeferredItem<Item> LAVACOBBLESTONE = block(FloisHadeanModModBlocks.LAVACOBBLESTONE);
	public static final DeferredItem<Item> LAVAROCK = block(FloisHadeanModModBlocks.LAVAROCK);
	public static final DeferredItem<Item> MOLTEN_LAVACOBBLESTONE = block(FloisHadeanModModBlocks.MOLTEN_LAVACOBBLESTONE);
	public static final DeferredItem<Item> HADEANPORTALBLOCK = block(FloisHadeanModModBlocks.HADEANPORTALBLOCK);
	public static final DeferredItem<Item> METEORITICIRON = block(FloisHadeanModModBlocks.METEORITICIRON);
	public static final DeferredItem<Item> ZIRCONORE = block(FloisHadeanModModBlocks.ZIRCONORE);
	public static final DeferredItem<Item> ZIRCONITEM = REGISTRY.register("zirconitem", ZirconitemItem::new);
	public static final DeferredItem<Item> ZIRCONBLOCK = block(FloisHadeanModModBlocks.ZIRCONBLOCK);
	public static final DeferredItem<Item> LIGHT_ASH = block(FloisHadeanModModBlocks.LIGHT_ASH);
	public static final DeferredItem<Item> ASH = block(FloisHadeanModModBlocks.ASH);
	public static final DeferredItem<Item> DARK_ASH = block(FloisHadeanModModBlocks.DARK_ASH);
	public static final DeferredItem<Item> ARCHEANPORTALBLOCK = block(FloisHadeanModModBlocks.ARCHEANPORTALBLOCK);
	public static final DeferredItem<Item> ARCHEAN = REGISTRY.register("archean", ArcheanItem::new);
	public static final DeferredItem<Item> RIPPLEDBLACKSAND = block(FloisHadeanModModBlocks.RIPPLEDBLACKSAND);
	public static final DeferredItem<Item> ARCHEAN_MICROBIALMAT = block(FloisHadeanModModBlocks.ARCHEAN_MICROBIALMAT);
	public static final DeferredItem<Item> PROTEROZOICPORTALBLOCK = block(FloisHadeanModModBlocks.PROTEROZOICPORTALBLOCK);
	public static final DeferredItem<Item> PROTEROZOIC = REGISTRY.register("proterozoic", ProterozoicItem::new);
	public static final DeferredItem<Item> IRONSAND = block(FloisHadeanModModBlocks.IRONSAND);
	public static final DeferredItem<Item> RIPPLEDIRONSAND = block(FloisHadeanModModBlocks.RIPPLEDIRONSAND);
	public static final DeferredItem<Item> MICROBIALMATT = block(FloisHadeanModModBlocks.MICROBIALMATT);
	public static final DeferredItem<Item> TAWUIA = block(FloisHadeanModModBlocks.TAWUIA);
	public static final DeferredItem<Item> ANCIENTMUD = block(FloisHadeanModModBlocks.ANCIENTMUD);
	public static final DeferredItem<Item> GRYPANIA = block(FloisHadeanModModBlocks.GRYPANIA);
	public static final DeferredItem<Item> REDALGAE = block(FloisHadeanModModBlocks.REDALGAE);
	public static final DeferredItem<Item> GREENALGAE = block(FloisHadeanModModBlocks.GREENALGAE);
	public static final DeferredItem<Item> STROMATOLITESTEM = block(FloisHadeanModModBlocks.STROMATOLITESTEM);
	public static final DeferredItem<Item> STROMATOLITE = block(FloisHadeanModModBlocks.STROMATOLITE);
	public static final DeferredItem<Item> IRONSTONE = block(FloisHadeanModModBlocks.IRONSTONE);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
