package com.cascadia.cgessentials.core.init;

import com.cascadia.cgessentials.cgessentials;
import com.cascadia.cgessentials.common.items.ModMusicDiscItem;
import com.cascadia.cgessentials.common.items.astral_slicer;


import net.minecraft.item.*;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {

    //Normal Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, cgessentials.MOD_ID);

    public static final RegistryObject<Item> PARMESAN_BALL = ITEMS.register("parmesan_ball",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<astral_slicer> ASTRAL_SLICER =ITEMS.register("astral_slicer",
            () -> new astral_slicer(new Item.Properties().group(ItemGroup.COMBAT)
                    .defaultMaxDamage(10000000)));
    public static final RegistryObject<Item> RICK_DISK = ITEMS.register("rick_disc",
            () -> new ModMusicDiscItem(5, SoundInit.LAZY_RICK_MUSIC.get(),
                    new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.EPIC)));


    //Block Items

    public static final RegistryObject<BlockItem> A_BLOCK = ITEMS.register("a_block", () -> new BlockItem(BlockInit.A_BLOCK.get(), new Item.Properties()

            .group(ItemGroup.BUILDING_BLOCKS)));
}
