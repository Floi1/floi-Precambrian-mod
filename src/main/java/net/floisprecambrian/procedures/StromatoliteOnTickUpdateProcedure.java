package net.floisprecambrian.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.floisprecambrian.init.FloisPrecambrianModBlocks;

public class StromatoliteOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FloisPrecambrianModBlocks.STROMATOLITE.get())) {
			world.setBlock(BlockPos.containing(x, y, z),
					(FloisPrecambrianModBlocks.STROMATOLITESTEM.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp4
							? FloisPrecambrianModBlocks.STROMATOLITESTEM.get().defaultBlockState().setValue(_withbp4, true)
							: FloisPrecambrianModBlocks.STROMATOLITESTEM.get().defaultBlockState()),
					3);
			world.setBlock(BlockPos.containing(x, y + 1, z),
					(FloisPrecambrianModBlocks.STROMATOLITE.get().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp6
							? FloisPrecambrianModBlocks.STROMATOLITE.get().defaultBlockState().setValue(_withbp6, true)
							: FloisPrecambrianModBlocks.STROMATOLITE.get().defaultBlockState()),
					3);
		}
	}
}
