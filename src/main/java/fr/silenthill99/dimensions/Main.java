package fr.silenthill99.dimensions;


import fr.silenthill99.dimensions.world.biome.ModBiomeGeneration;
import fr.silenthill99.dimensions.world.biome.ModBiomes;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main
{

    public static final String MODID = "dimensions";

    public Main()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        ModBiomes.BIOMES.register(bus);
    }

    private void setup(FMLCommonSetupEvent event)
    {
        ModBiomeGeneration.generateBiomes();
    }

    private void clientSetup(FMLClientSetupEvent event)
    {
    }

}
