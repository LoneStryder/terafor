package stryder.terafor.util.helper;

import net.minecraft.util.ResourceLocation;
import stryder.terafor.Terafor;

public class LocationHelper {
	public static ResourceLocation modPrefix(String path) {
		return new ResourceLocation(Terafor.MOD_ID, path);
	}
}
