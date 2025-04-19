package net.floisprecambrian.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.floisprecambrian.init.FloisPrecambrianModBlocks;

public class CloudinaBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean properHeight = false;
		boolean foundWater = false;
		foundWater = false;
		properHeight = false;
		if (y >= 53 && y <= 63) {
			properHeight = true;
		}
		if (properHeight == true) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
				foundWater = true;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) {
				foundWater = true;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_COLUMN) {
				foundWater = true;
			}
		}
		if (foundWater == true) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIRT) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SAND) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRAVEL) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CLAY) {
				return true;
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FloisPrecambrianModBlocks.STROMATOLITESTEM.get()) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FloisPrecambrianModBlocks.STROMATOLITE.get()) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.STONE) {
				return true;
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FloisPrecambrianModBlocks.BLACKSAND.get()) {
				return true;
			}
		}
		return false;
	}
}
