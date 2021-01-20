package com.cascadia.cgessentials.core.init;

import com.cascadia.cgessentials.cgessentials;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block>  BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, cgessentials.MOD_ID);

    public static final RegistryObject<Block> A_BLOCK = BLOCKS.register("a_block",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BLUE)
                    .hardnessAndResistance(5f, 30f)
                    .harvestLevel(-1)
                    .harvestTool(ToolType.AXE)
                    .setRequiresTool()
                    .sound(SoundType.WOOD)));
}
