
package net.floishadean.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class AshBlock extends FallingBlock {
	public static final MapCodec<AshBlock> CODEC = simpleCodec(properties -> new AshBlock());

	public MapCodec<AshBlock> codec() {
		return CODEC;
	}

	public AshBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
