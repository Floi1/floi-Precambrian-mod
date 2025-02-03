
package net.floishadean.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ZirconoreBlock extends Block {
	public ZirconoreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.STONE).strength(1.5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
