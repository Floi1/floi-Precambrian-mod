package net.floishadean.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.floishadean.init.FloisHadeanModModBlocks;

public class StromatoliteOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FloisHadeanModModBlocks.STROMATOLITE.get())) {
			world.setBlock(BlockPos.containing(x, y, z),
					(FloisHadeanModModBlocks.STROMATOLITESTEM.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp4
							? FloisHadeanModModBlocks.STROMATOLITESTEM.get().defaultBlockState().setValue(_withbp4, true)
							: FloisHadeanModModBlocks.STROMATOLITESTEM.get().defaultBlockState()),
					3);
			world.setBlock(BlockPos.containing(x, y + 1, z),
					(FloisHadeanModModBlocks.STROMATOLITE.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp6
							? FloisHadeanModModBlocks.STROMATOLITE.get().defaultBlockState().setValue(_withbp6, true)
							: FloisHadeanModModBlocks.STROMATOLITE.get().defaultBlockState()),
					3);
		}
	}
}
