package stryder.terafor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import stryder.terafor.util.ModUtils;
import stryder.terafor.util.helper.LocationHelper;
import stryder.terafor.world.gen.feature.ModFeatures;

@EventBusSubscriber(modid = Terafor.MOD_ID)
public class ForgeEventSubscriber {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void onBiomeLoad(final BiomeLoadingEvent event) {
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ModFeatures.ORE_COPPER);
		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ModFeatures.ORE_SILVER);
	}

	@SubscribeEvent
	public static void onLivingDamage(LivingDamageEvent event) {
		Entity true_source = event.getSource().getTrueSource();
		LivingEntity target = event.getEntityLiving();
		float damage = event.getAmount();

		if (true_source instanceof LivingEntity) {
			LivingEntity living_source = (LivingEntity) true_source;
			if (target.isEntityUndead()) {
				if (ModUtils.hasItemTag(living_source.getHeldItemMainhand(), LocationHelper.modPrefix("materials/silver"))) {
					event.setAmount(damage * 1.2F);
					//event.getEntityLiving().setFire(3); Disabled for now.
				}
			}
			if (living_source.isEntityUndead()) {
				event.setAmount(damage * silverReductionCheck(target.getArmorInventoryList()));
			}
		}
	}

	private static float silverReductionCheck(Iterable<ItemStack> armor) {
		int counter = 0;
		for (ItemStack stack : armor) {
			if (ModUtils.hasItemTag(stack, LocationHelper.modPrefix("materials/silver"))) {
				counter++;
			}
		}

		return (0.05F * counter);
	}
}
