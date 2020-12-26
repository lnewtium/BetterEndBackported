package mod.beethoven92.betterendforge.common.block;

import mod.beethoven92.betterendforge.common.block.template.PlantBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TerrainPlantBlock extends PlantBlock
{
	private final Block ground;
	
	public TerrainPlantBlock(Block ground)
	{
		super(AbstractBlock.Properties.create(Material.TALL_PLANTS).
                zeroHardnessAndResistance().
                doesNotBlockMovement().
                sound(SoundType.PLANT));
		
		this.ground = ground;
	}
	
	@Override
	protected boolean isTerrain(BlockState state) 
	{
		return state.isIn(ground);
	}
}
