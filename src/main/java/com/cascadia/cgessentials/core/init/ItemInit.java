package com.cascadia.cgessentials.core.init;

import com.cascadia.cgessentials.cgessentials;
import com.cascadia.cgessentials.common.items.astral_slicer;


import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    //Normal Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, cgessentials.MOD_ID);

    public static final RegistryObject<Item> PARMESAN_BALL = ITEMS.register("parmesan_ball",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<astral_slicer> ASTRAL_SLICER =ITEMS.register("astral_slicer",
            () -> new astral_slicer(new Item.Properties().group(ItemGroup.COMBAT)
                    .defaultMaxDamage(10000000)));


    //Block Items

    public static final RegistryObject<BlockItem> A_BLOCK = ITEMS.register("a_block", () -> new BlockItem(BlockInit.A_BLOCK.get(), new Item.Properties()

            .group(ItemGroup.BUILDING_BLOCKS)));
}
