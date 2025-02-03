
package net.floishadean.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MicrobialmatBlock extends Block {
	public MicrobialmatBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).strength(1f, 10f).friction(0.7f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
