package stryder.terafor.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import stryder.terafor.Terafor;

public class ModItemGroup {
	public static final ItemGroup INSTANCE = (new ItemGroup(Terafor.MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return ModItems.SILVER_INGOT.get().getDefaultInstance();
		}
	});
}
