package stryder.terafor.util;

import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import stryder.terafor.Terafor;

public class ModUtils {
	public static boolean hasItemTag(ItemStack stack, ResourceLocation id) {
		return ItemTags.getCollection().getTagByID(id).contains(stack.getItem());
	}

	public static ResourceLocation modResLoc(String path) {
		return new ResourceLocation(Terafor.MOD_ID, path);
	}
}
