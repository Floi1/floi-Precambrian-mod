
package net.floisprecambrian.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class DarkashBlock extends FallingBlock {
	public static final MapCodec<DarkashBlock> CODEC = simpleCodec(properties -> new DarkashBlock());

	public MapCodec<DarkashBlock> codec() {
		return CODEC;
	}

	public DarkashBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
