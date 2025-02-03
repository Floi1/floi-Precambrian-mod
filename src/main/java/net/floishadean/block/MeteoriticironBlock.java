
package net.floishadean.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MeteoriticironBlock extends Block {
	public MeteoriticironBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.STONE).strength(2f, 100f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
