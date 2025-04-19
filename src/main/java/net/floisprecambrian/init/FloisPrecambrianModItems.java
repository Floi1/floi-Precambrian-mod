
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floisprecambrian.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.floisprecambrian.item.ZirconitemItem;
import net.floisprecambrian.item.ProterozoicItem;
import net.floisprecambrian.item.HadeanItem;
import net.floisprecambrian.item.ArcheanItem;
import net.floisprecambrian.FloisPrecambrianMod;

public class FloisPrecambrianModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FloisPrecambrianMod.MODID);
	public static final DeferredItem<Item> HADEAN = REGISTRY.register("hadean", HadeanItem::new);
	public static final DeferredItem<Item> BLACKSAND = block(FloisPrecambrianModBlocks.BLACKSAND);
	public static final DeferredItem<Item> LAVACOBBLESTONE = block(FloisPrecambrianModBlocks.LAVACOBBLESTONE);
	public static final DeferredItem<Item> LAVAROCK = block(FloisPrecambrianModBlocks.LAVAROCK);
	public static final DeferredItem<Item> MOLTEN_LAVACOBBLESTONE = block(FloisPrecambrianModBlocks.MOLTEN_LAVACOBBLESTONE);
	public static final DeferredItem<Item> HADEANPORTALBLOCK = block(FloisPrecambrianModBlocks.HADEANPORTALBLOCK);
	public static final DeferredItem<Item> METEORITICIRON = block(FloisPrecambrianModBlocks.METEORITICIRON);
	public static final DeferredItem<Item> ZIRCONORE = block(FloisPrecambrianModBlocks.ZIRCONORE);
	public static final DeferredItem<Item> ZIRCONITEM = REGISTRY.register("zirconitem", ZirconitemItem::new);
	public static final DeferredItem<Item> ZIRCONBLOCK = block(FloisPrecambrianModBlocks.ZIRCONBLOCK);
	public static final DeferredItem<Item> LIGHT_ASH = block(FloisPrecambrianModBlocks.LIGHT_ASH);
	public static final DeferredItem<Item> ASH = block(FloisPrecambrianModBlocks.ASH);
	public static final DeferredItem<Item> DARK_ASH = block(FloisPrecambrianModBlocks.DARK_ASH);
	public static final DeferredItem<Item> ARCHEANPORTALBLOCK = block(FloisPrecambrianModBlocks.ARCHEANPORTALBLOCK);
	public static final DeferredItem<Item> ARCHEAN = REGISTRY.register("archean", ArcheanItem::new);
	public static final DeferredItem<Item> RIPPLEDBLACKSAND = block(FloisPrecambrianModBlocks.RIPPLEDBLACKSAND);
	public static final DeferredItem<Item> ARCHEAN_MICROBIALMAT = block(FloisPrecambrianModBlocks.ARCHEAN_MICROBIALMAT);
	public static final DeferredItem<Item> PROTEROZOICPORTALBLOCK = block(FloisPrecambrianModBlocks.PROTEROZOICPORTALBLOCK);
	public static final DeferredItem<Item> PROTEROZOIC = REGISTRY.register("proterozoic", ProterozoicItem::new);
	public static final DeferredItem<Item> IRONSAND = block(FloisPrecambrianModBlocks.IRONSAND);
	public static final DeferredItem<Item> RIPPLEDIRONSAND = block(FloisPrecambrianModBlocks.RIPPLEDIRONSAND);
	public static final DeferredItem<Item> MICROBIALMATT = block(FloisPrecambrianModBlocks.MICROBIALMATT);
	public static final DeferredItem<Item> TAWUIA = block(FloisPrecambrianModBlocks.TAWUIA);
	public static final DeferredItem<Item> ANCIENTMUD = block(FloisPrecambrianModBlocks.ANCIENTMUD);
	public static final DeferredItem<Item> GRYPANIA = block(FloisPrecambrianModBlocks.GRYPANIA);
	public static final DeferredItem<Item> REDALGAE = block(FloisPrecambrianModBlocks.REDALGAE);
	public static final DeferredItem<Item> GREENALGAE = block(FloisPrecambrianModBlocks.GREENALGAE);
	public static final DeferredItem<Item> STROMATOLITESTEM = block(FloisPrecambrianModBlocks.STROMATOLITESTEM);
	public static final DeferredItem<Item> STROMATOLITE = block(FloisPrecambrianModBlocks.STROMATOLITE);
	public static final DeferredItem<Item> IRONSTONE = block(FloisPrecambrianModBlocks.IRONSTONE);
	public static final DeferredItem<Item> HORODYSKIA = block(FloisPrecambrianModBlocks.HORODYSKIA);
	public static final DeferredItem<Item> BACTERIALMAT = block(FloisPrecambrianModBlocks.BACTERIALMAT);
	public static final DeferredItem<Item> BOMAKELLIA = block(FloisPrecambrianModBlocks.BOMAKELLIA);
	public static final DeferredItem<Item> FUNISIA = block(FloisPrecambrianModBlocks.FUNISIA);
	public static final DeferredItem<Item> HELICOLOCELLUS = block(FloisPrecambrianModBlocks.HELICOLOCELLUS);
	public static final DeferredItem<Item> BELTANELLIFORMIS = block(FloisPrecambrianModBlocks.BELTANELLIFORMIS);
	public static final DeferredItem<Item> SCORIA = block(FloisPrecambrianModBlocks.SCORIA);
	public static final DeferredItem<Item> ARBOREA = block(FloisPrecambrianModBlocks.ARBOREA);
	public static final DeferredItem<Item> RANGEA = block(FloisPrecambrianModBlocks.RANGEA);
	public static final DeferredItem<Item> CHARNIA = block(FloisPrecambrianModBlocks.CHARNIA);
	public static final DeferredItem<Item> PARACHARNIA = block(FloisPrecambrianModBlocks.PARACHARNIA);
	public static final DeferredItem<Item> SWARTPUNTIA = block(FloisPrecambrianModBlocks.SWARTPUNTIA);
	public static final DeferredItem<Item> FINKOELLA = block(FloisPrecambrianModBlocks.FINKOELLA);
	public static final DeferredItem<Item> CLOUDINA = block(FloisPrecambrianModBlocks.CLOUDINA);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
