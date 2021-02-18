package stryder.terafor;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import stryder.terafor.block.ModBlocks;
import stryder.terafor.item.ModItems;
import stryder.terafor.util.ModUtils;
import stryder.terafor.world.gen.feature.ModFeatures;

@Mod(Terafor.MOD_ID)
public class Terafor {
	//private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "terafor";

	public Terafor() {
		final IEventBus MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

		MOD_EVENT_BUS.addListener(this::setup);
		MOD_EVENT_BUS.addListener(this::clientSetup);
		/*MOD_EVENT_BUS.addListener(this::enqueueIMC);
		MOD_EVENT_BUS.addListener(this::processIMC);*/

		ModBlocks.BLOCKS.register(MOD_EVENT_BUS);
		ModItems.ITEMS.register(MOD_EVENT_BUS);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ModUtils.modResLoc("ore_silver"), ModFeatures.ORE_SILVER);
	}

	private void clientSetup(final FMLClientSetupEvent event) {

	}

	/*private void enqueueIMC(final InterModEnqueueEvent event) {

	}

	private void processIMC(final InterModProcessEvent event) {

	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {

	}*/
}
