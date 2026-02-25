package com.willr27.blocklings.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BlockState;
import net.minecraft.world.level.block.material.Material;
import net.minecraft.world.level.block.material.MaterialColor;
import net.minecraft.core.BlockPos;
import net.minecraft.core.shapes.ISelectionContext;
import net.minecraft.core.shapes.VoxelShape;
import net.minecraft.core.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

/**
 * An invisible block that emits light.
 * Used by blocklings to emit light.
 */
public class LightBlock extends Block
{
    /**
     * Default constructor.
     */
    public LightBlock()
    {
        super(AbstractBlock.Properties.of(new Material.Builder(MaterialColor.NONE)
                .replaceable()
                .nonSolid()
                .build())
                .noDrops()
                .noOcclusion()
                .noCollission()
                .lightLevel((blockState) -> 15));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, IBlockReader blockReader, BlockPos blockPos, ISelectionContext selectionContext)
    {
        return VoxelShapes.empty();
    }
}
