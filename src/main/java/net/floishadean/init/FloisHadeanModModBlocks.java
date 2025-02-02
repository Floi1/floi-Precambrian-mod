
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

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
	public static final DeferredBlock<Block> HADEAN_PORTAL = REGISTRY.register("hadean_portal", HadeanPortalBlock::new);
	public static final DeferredBlock<Block> BLACKSAND = REGISTRY.register("blacksand", BlacksandBlock::new);
	public static final DeferredBlock<Block> LAVACOBBLESTONE = REGISTRY.register("lavacobblestone", BlackcobblestoneBlock::new);
	public static final DeferredBlock<Block> LAVAROCK = REGISTRY.register("lavarock", LavarockBlock::new);
	public static final DeferredBlock<Block> MOLTEN_LAVACOBBLESTONE = REGISTRY.register("molten_lavacobblestone", MoltenLavacobblestoneBlock::new);
	public static final DeferredBlock<Block> HADEANPORTALBLOCK = REGISTRY.register("hadeanportalblock", HadeanportalblockBlock::new);
	public static final DeferredBlock<Block> METEORITICIRON = REGISTRY.register("meteoriticiron", MeteoriticironBlock::new);
	public static final DeferredBlock<Block> ZIRCONORE = REGISTRY.register("zirconore", ZirconoreBlock::new);
	public static final DeferredBlock<Block> ZIRCONBLOCK = REGISTRY.register("zirconblock", ZirconblockBlock::new);
	public static final DeferredBlock<Block> LIGHT_ASH = REGISTRY.register("light_ash", LightashBlock::new);
	public static final DeferredBlock<Block> ASH = REGISTRY.register("ash", AshBlock::new);
	public static final DeferredBlock<Block> DARK_ASH = REGISTRY.register("dark_ash", DarkashBlock::new);
	public static final DeferredBlock<Block> ARCHEANPORTALBLOCK = REGISTRY.register("archeanportalblock", ArcheanportalblockBlock::new);
	public static final DeferredBlock<Block> ARCHEAN_PORTAL = REGISTRY.register("archean_portal", ArcheanPortalBlock::new);
	public static final DeferredBlock<Block> RIPPLEDBLACKSAND = REGISTRY.register("rippledblacksand", RippledblacksandBlock::new);
	public static final DeferredBlock<Block> MICROBIALMAT = REGISTRY.register("microbialmat", MicrobialmatBlock::new);
	public static final DeferredBlock<Block> STROMATOLITE = REGISTRY.register("stromatolite", StromatoliteBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
