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

	public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(ModBlocks.COPPER_BLOCK.get(), createProperties()));
	public static final RegistryObject<Item> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), createProperties()));
	public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), createProperties()));

	public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(ModBlocks.COPPER_ORE.get(), createProperties()));
	public static final RegistryObject<Item> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(ModBlocks.SAPPHIRE_ORE.get(), createProperties()));
	public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(ModBlocks.SILVER_ORE.get(), createProperties()));

	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(createProperties()));
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(createProperties()));

	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(createProperties()));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(createProperties()));

	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(createProperties()));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(createProperties()));

	public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModItemTiers.COPPER, 3, -2.4F, createProperties()));
	public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTiers.SILVER, 3, -2.4F, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModItemTiers.SAPPHIRE, 3, -2.4F, createProperties()));
	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ModItemTiers.SILVER, 3, -2.4F, createProperties()));

	public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModItemTiers.COPPER, 1, -2.8F, createProperties()));
	public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTiers.RUBY, 1, -2.8F, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModItemTiers.SAPPHIRE, 1, -2.8F, createProperties()));
	public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModItemTiers.SILVER, 1, -2.8F, createProperties()));

	public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModItemTiers.COPPER, 1.5F, -3.0F, createProperties()));
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTiers.RUBY, 1.5F, -3.0F, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModItemTiers.SAPPHIRE, 1.5F, -3.0F, createProperties()));
	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ModItemTiers.SILVER, 1.5F, -3.0F, createProperties()));

	public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModItemTiers.COPPER, 6.0F, -3.0F, createProperties()));
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTiers.RUBY, 5.0F, -3.0F, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModItemTiers.SAPPHIRE, 5.0F, -3.0F, createProperties()));
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ModItemTiers.SILVER, 6.0F, -3.1F, createProperties()));

	public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModItemTiers.COPPER, -1, -3.0F, createProperties()));
	public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTiers.RUBY, -3, 0.0F, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModItemTiers.SAPPHIRE, -2, 0.0F, createProperties()));
	public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ModItemTiers.SILVER, -1, -2.0F, createProperties()));

	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlotType.HEAD, createProperties()));
	public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.HEAD, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.HEAD, createProperties()));
	public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.HEAD, createProperties()));

	public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlotType.CHEST, createProperties()));
	public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.CHEST, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.CHEST, createProperties()));
	public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.CHEST, createProperties()));

	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlotType.LEGS, createProperties()));
	public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.LEGS, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.LEGS, createProperties()));
	public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.LEGS, createProperties()));

	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlotType.FEET, createProperties()));
	public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlotType.FEET, createProperties()));
	public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlotType.FEET, createProperties()));
	public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlotType.FEET, createProperties()));
}
