package com.cascadia.cgessentials.core.init;

import com.cascadia.cgessentials.cgessentials;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
    //Sound Register
    public static final DeferredRegister<SoundEvent>  SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, cgessentials.MOD_ID);


    public static final Lazy<SoundEvent> LAZY_RICK_MUSIC = Lazy
            .of(() -> new SoundEvent(new ResourceLocation(cgessentials.MOD_ID,"disc.rick")));
    //Actual custom sounds
    public static final RegistryObject<SoundEvent> RICK_MUSIC = SOUNDS.register("disc_rick",
            LAZY_RICK_MUSIC);
}
