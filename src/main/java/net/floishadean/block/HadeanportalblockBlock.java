
package net.floishadean.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class HadeanportalblockBlock extends Block {
	public HadeanportalblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.STONE).strength(5f, 100f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
