
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floisprecambrian.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.floisprecambrian.block.entity.TawuiaBlockEntity;
import net.floisprecambrian.block.entity.StromatoliteBlockEntity;
import net.floisprecambrian.block.entity.RedalgaeBlockEntity;
import net.floisprecambrian.block.entity.HorodyskiaBlockEntity;
import net.floisprecambrian.block.entity.GrypaniaBlockEntity;
import net.floisprecambrian.block.entity.GreenalgaeBlockEntity;
import net.floisprecambrian.FloisPrecambrianMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FloisPrecambrianModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FloisPrecambrianMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TAWUIA = register("tawuia", FloisPrecambrianModBlocks.TAWUIA, TawuiaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRYPANIA = register("grypania", FloisPrecambrianModBlocks.GRYPANIA, GrypaniaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> REDALGAE = register("redalgae", FloisPrecambrianModBlocks.REDALGAE, RedalgaeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GREENALGAE = register("greenalgae", FloisPrecambrianModBlocks.GREENALGAE, GreenalgaeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> STROMATOLITE = register("stromatolite", FloisPrecambrianModBlocks.STROMATOLITE, StromatoliteBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HORODYSKIA = register("horodyskia", FloisPrecambrianModBlocks.HORODYSKIA, HorodyskiaBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TAWUIA.get(), (blockEntity, side) -> ((TawuiaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRYPANIA.get(), (blockEntity, side) -> ((GrypaniaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REDALGAE.get(), (blockEntity, side) -> ((RedalgaeBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GREENALGAE.get(), (blockEntity, side) -> ((GreenalgaeBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STROMATOLITE.get(), (blockEntity, side) -> ((StromatoliteBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HORODYSKIA.get(), (blockEntity, side) -> ((HorodyskiaBlockEntity) blockEntity).getItemHandler());
	}
}
