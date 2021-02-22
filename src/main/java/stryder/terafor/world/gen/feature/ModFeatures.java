package stryder.terafor.world.gen.feature;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import stryder.terafor.block.ModBlocks;

public class ModFeatures {
	public static final ConfiguredFeature<?, ?> ORE_COPPER = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, States.COPPER_ORE, 13)).range(64).square().func_242731_b(20);
	public static final ConfiguredFeature<?, ?> ORE_RUBY = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, States.RUBY_ORE, 8)).range(16).square();
	public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, States.SAPPHIRE_ORE, 8)).range(16).square();
	public static final ConfiguredFeature<?, ?> ORE_SILVER = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, States.SILVER_ORE, 9)).range(48).square().func_242731_b(3);

	public static final class States {
		protected static final BlockState COPPER_ORE = ModBlocks.COPPER_ORE.get().getDefaultState();
		protected static final BlockState RUBY_ORE = ModBlocks.RUBY_ORE.get().getDefaultState();
		protected static final BlockState SAPPHIRE_ORE = ModBlocks.SAPPHIRE_ORE.get().getDefaultState();
		protected static final BlockState SILVER_ORE = ModBlocks.SILVER_ORE.get().getDefaultState();
	}
}
