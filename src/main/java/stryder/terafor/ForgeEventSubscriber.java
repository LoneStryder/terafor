package stryder.terafor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import stryder.terafor.util.ModUtils;

@EventBusSubscriber(modid = Terafor.MOD_ID)
public class ForgeEventSubscriber {
	@SubscribeEvent
	public static void onLivingDamage(LivingDamageEvent event) {
		Entity true_source = event.getSource().getTrueSource();
		if (true_source instanceof LivingEntity) {
			if (ModUtils.hasItemTag(((LivingEntity) true_source).getHeldItemMainhand(), ModUtils.modResLoc("materials/silver"))) {
				if (event.getEntityLiving().isEntityUndead()) {
					event.setAmount(event.getAmount() * 1.2F);
					event.getEntityLiving().setFire(3);
				}
			}
		}
	}
}
