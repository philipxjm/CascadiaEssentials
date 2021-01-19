package com.cascadia.cgessentials.core.init;

import com.cascadia.cgessentials.cgessentials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, cgessentials.MOD_ID);

    public static final RegistryObject<Item> PARMESAN_BALL = ITEMS.register("parmesan_ball",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
