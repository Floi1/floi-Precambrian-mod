package net.floisprecambrian.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.floisprecambrian.init.FloisPrecambrianModBlocks;

public class RangeaBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource() == false && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == false) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource() == false || world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == false) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FloisPrecambrianModBlocks.RANGEA.get()) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
