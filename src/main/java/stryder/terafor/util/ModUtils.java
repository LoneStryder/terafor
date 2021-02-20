package stryder.terafor.util;

import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModUtils {
	public static boolean hasItemTag(ItemStack stack, ResourceLocation id) {
		return ItemTags.getCollection().getTagByID(id).contains(stack.getItem());
	}
}
