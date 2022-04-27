package com.batleram.brtrackermod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

import java.util.regex.Pattern;

@Mod(modid = BRTrackerMod.MODID, version = BRTrackerMod.VERSION)
public class BRTrackerMod {
    public static final String MODID = "br-tracker-mod";
    public static final String VERSION = "1.0";
    static RegexIdentifier regexIdentifier = new RegexIdentifier();

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("MOD LOADED MAYBE...");
        MinecraftForge.EVENT_BUS.register(new Ticker());
    }
}

class Ticker {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void recievedChatMessage(ClientChatReceivedEvent event) {
        System.out.println(event.message.getUnformattedTextForChat());
    }
}

class RegexIdentifier {
    public boolean isBloodOpenMessage(String message) {
        return Pattern.matches("The\\sBLOOD\\sDOOR\\shas\\sbeen\\sopened", message);
    }

    public boolean isDungeonStartMessage(String message){
        return Pattern.matches("Dungeon\\sstarts\\sin\\s1\\ssecond", message);
    }

    public boolean hasDungeonIdentifier(String message){
        return Pattern.matches("(Catacombs)|(Master)",message);
    }
}
