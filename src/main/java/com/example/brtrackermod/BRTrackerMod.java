package com.example.brtrackermod;

import net.minecraft.init.Blocks;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.server.ForgeTimeTracker;

@Mod(modid = BRTrackerMod.MODID, version = BRTrackerMod.VERSION)
public class BRTrackerMod
{
    public static final String MODID = "br-tracker-mod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("MOD LOADED MAYBE...");
    }
}
