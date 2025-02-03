
package net.floishadean.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class AshBlock extends FallingBlock {
	public static final MapCodec<AshBlock> CODEC = simpleCodec(AshBlock::new);

	public MapCodec<AshBlock> codec() {
		return CODEC;
	}

	public AshBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
