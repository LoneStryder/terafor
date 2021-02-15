package stryder.terafor.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import stryder.terafor.Terafor;
import stryder.terafor.block.ModBlocks;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Terafor.MOD_ID);

	private static Item.Properties createProperties() {
		return new Item.Properties().group(ModItemGroup.INSTANCE);
	}

	private static Item.Properties createProperties(ItemGroup group) {
		return new Item.Properties().group(group);
	}

	public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), createProperties()));

	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(createProperties()));
}
