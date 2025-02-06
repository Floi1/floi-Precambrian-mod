
package net.floishadean.block;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.floishadean.procedures.BlacksandOnBlockRightClickedProcedure;

import com.mojang.serialization.MapCodec;

public class BlacksandBlock extends FallingBlock {
	public static final MapCodec<BlacksandBlock> CODEC = simpleCodec(properties -> new BlacksandBlock());

	public MapCodec<BlacksandBlock> codec() {
		return CODEC;
	}

	public BlacksandBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.SAND).strength(0.5f, 1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		BlacksandOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
