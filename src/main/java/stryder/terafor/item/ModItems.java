package stryder.terafor.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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
	public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(ModBlocks.SILVER_ORE.get(), createProperties()));

	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(createProperties()));
	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ModItemTiers.SILVER, 3, -2.4F, createProperties()));
	public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModItemTiers.SILVER, 1, -2.8F, createProperties()));
	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ModItemTiers.SILVER, 1.5F, -3.0F, createProperties()));
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ModItemTiers.SILVER, 6.0F, -3.1F, createProperties()));
	public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ModItemTiers.SILVER, -1, -2.0F, createProperties()));
	public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.HEAD, createProperties()));
	public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.CHEST, createProperties()));
	public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.LEGS, createProperties()));
	public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.FEET, createProperties()));
}
