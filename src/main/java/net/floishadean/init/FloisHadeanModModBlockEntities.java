
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.floishadean.block.entity.TawuiaBlockEntity;
import net.floishadean.block.entity.RedalgaeBlockEntity;
import net.floishadean.block.entity.GrypaniaBlockEntity;
import net.floishadean.block.entity.GreenalgaeBlockEntity;
import net.floishadean.FloisHadeanModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FloisHadeanModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FloisHadeanModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TAWUIA = register("tawuia", FloisHadeanModModBlocks.TAWUIA, TawuiaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRYPANIA = register("grypania", FloisHadeanModModBlocks.GRYPANIA, GrypaniaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> REDALGAE = register("redalgae", FloisHadeanModModBlocks.REDALGAE, RedalgaeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GREENALGAE = register("greenalgae", FloisHadeanModModBlocks.GREENALGAE, GreenalgaeBlockEntity::new);

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
	}
}
