
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.floishadean.block.ZirconoreBlock;
import net.floishadean.block.ZirconblockBlock;
import net.floishadean.block.StromatoliteBlock;
import net.floishadean.block.RippledblacksandBlock;
import net.floishadean.block.MoltenLavacobblestoneBlock;
import net.floishadean.block.MicrobialmatBlock;
import net.floishadean.block.MeteoriticironBlock;
import net.floishadean.block.LightashBlock;
import net.floishadean.block.LavarockBlock;
import net.floishadean.block.HadeanportalblockBlock;
import net.floishadean.block.HadeanPortalBlock;
import net.floishadean.block.DarkashBlock;
import net.floishadean.block.BlacksandBlock;
import net.floishadean.block.BlackcobblestoneBlock;
import net.floishadean.block.AshBlock;
import net.floishadean.block.ArcheanportalblockBlock;
import net.floishadean.block.ArcheanPortalBlock;
import net.floishadean.FloisHadeanModMod;

public class FloisHadeanModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FloisHadeanModMod.MODID);
	public static final DeferredBlock<Block> HADEAN_PORTAL = REGISTRY.registerBlock("hadean_portal", HadeanPortalBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> BLACKSAND = REGISTRY.registerBlock("blacksand", BlacksandBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> LAVACOBBLESTONE = REGISTRY.registerBlock("lavacobblestone", BlackcobblestoneBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> LAVAROCK = REGISTRY.registerBlock("lavarock", LavarockBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> MOLTEN_LAVACOBBLESTONE = REGISTRY.registerBlock("molten_lavacobblestone", MoltenLavacobblestoneBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> HADEANPORTALBLOCK = REGISTRY.registerBlock("hadeanportalblock", HadeanportalblockBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> METEORITICIRON = REGISTRY.registerBlock("meteoriticiron", MeteoriticironBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> ZIRCONORE = REGISTRY.registerBlock("zirconore", ZirconoreBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> ZIRCONBLOCK = REGISTRY.registerBlock("zirconblock", ZirconblockBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> LIGHT_ASH = REGISTRY.registerBlock("light_ash", LightashBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> ASH = REGISTRY.registerBlock("ash", AshBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> DARK_ASH = REGISTRY.registerBlock("dark_ash", DarkashBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> ARCHEANPORTALBLOCK = REGISTRY.registerBlock("archeanportalblock", ArcheanportalblockBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> ARCHEAN_PORTAL = REGISTRY.registerBlock("archean_portal", ArcheanPortalBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> RIPPLEDBLACKSAND = REGISTRY.registerBlock("rippledblacksand", RippledblacksandBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> MICROBIALMAT = REGISTRY.registerBlock("microbialmat", MicrobialmatBlock::new, BlockBehaviour.Properties.of());
	public static final DeferredBlock<Block> STROMATOLITE = REGISTRY.registerBlock("stromatolite", StromatoliteBlock::new, BlockBehaviour.Properties.of());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
