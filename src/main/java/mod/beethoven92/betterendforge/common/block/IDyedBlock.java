package mod.beethoven92.betterendforge.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.DyeColor;

public interface IDyedBlock 
{
	Block createFromColor(DyeColor color);
}
