package com.tu_nombre.cassymod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CassyMod.MOD_ID)
public class CassyMod {
    public static final String MOD_ID = "cassymod";

    public CassyMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Registro del bus de eventos
        MinecraftForge.EVENT_BUS.register(this);
    }
}
